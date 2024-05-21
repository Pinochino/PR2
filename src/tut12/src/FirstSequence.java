package tut12.src;

import java.util.Vector;

public class FirstSequence {
    private static final int MIN_INDEX = 1;
    private final Integer index; // n
    private final Integer val; // n!
    private static Vector<FirstSequence> stateStruc; // intermediate values

    private FirstSequence(int n) {
        this.index = n;
        if (n == 1) {
            val = 0;
        } else {
            // get/compute previous objects
            FirstSequence prev = lookUp(n - 1);
            if (prev == null) prev = new FirstSequence(n - 1); // recursive call

            // compute this object
            val = prev.val + 2;
        }
        // puts this object into stateStruc
        stateStruc.add(this);
    }

    public static FirstSequence get(int index) {
        if (index < MIN_INDEX) return null;
        // get/compute the nth object
        if (stateStruc == null) stateStruc = new Vector<>();
        // determine if this number has been computed
        FirstSequence me = lookUp(index);
        if (me == null) // not yet computed...
            me = new FirstSequence(index);
        return me;
    }

    private static FirstSequence lookUp(int n) {
        FirstSequence f = null;
        if (n <= stateStruc.size()) {
            f = stateStruc.get(n - 1);
        }
        // debug
//        if (f != null) System.out.printf("--> Found: %s%n", f);
        return f;
    }

    public int getValue() {
        return val;
    }

    @Override
    public String toString() {
        return String.format("In index %d:  %d", index, val);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            FirstSequence ex = FirstSequence.get(i);
            System.out.println(ex);
        }
    }
}
