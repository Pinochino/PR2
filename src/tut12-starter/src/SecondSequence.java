package src;

import java.util.Vector;

public class SecondSequence {
    private static final int MIN_INDEX = 1;
    private final Integer index; // n
    private final Integer val; // n!
    private static Vector<SecondSequence> stateStruc; // intermediate values

    private SecondSequence(int n) {
        this.index = n;
        if (n == 1) {
            val = 0;
        } else if (n == 2) {
            val = 1;
        } else {
            // get/compute previous objects
            SecondSequence prev = lookUp(n - 1);
            if (prev == null) prev = new SecondSequence(n - 1); // recursive call

            // compute this object
            val = prev.val + n - 1;
        }
        // puts this object into stateStruc
        stateStruc.add(this);
    }

    public static SecondSequence get(int index) {
        if (index < MIN_INDEX) return null;
        // get/compute the nth object
        if (stateStruc == null) stateStruc = new Vector<>();
        // determine if this number has been computed
        SecondSequence me = lookUp(index);
        if (me == null) // not yet computed...
            me = new SecondSequence(index);
        return me;
    }

    private static SecondSequence lookUp(int n) {
        SecondSequence f = null;
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
            SecondSequence ex = SecondSequence.get(i);
            System.out.println(ex);
        }
    }
}
