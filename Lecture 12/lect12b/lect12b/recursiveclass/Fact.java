package lect12b.recursiveclass;

import java.util.Vector;

public class Fact {
    private static final int MIN_INDEX = 1;
    private Integer index; // n
    private Integer val; // n!
    private static Vector<Fact> stateStruc; // intermediate values

    private Fact(int n) {
        this.index = n;
        if (n == 1) {
            val = 1;
        } else {
            // get/compute previous objects
            Fact prev = lookUp(n - 1);
            if (prev == null) prev = new Fact(n - 1); // recursive call

            // compute this object
            val = n * prev.val;
        }
        // puts this object into stateStruc
        stateStruc.add(this);
    }

    public static Fact get(int index) {
        if (index < MIN_INDEX) return null;
        // get/compute the nth object
        if (stateStruc == null) stateStruc = new Vector<>();
        // determine if this number has been computed
        Fact me = lookUp(index);
        if (me == null) // not yet computed...
            me = new Fact(index);
        return me;
    }

    private static Fact lookUp(int n) {
        Fact f = null;
        if (n <= stateStruc.size()) {
            f = stateStruc.get(n - 1);
        }
        // debug
        if (f != null) System.out.printf("--> Found: %s%n", f);
        return f;
    }

    public int getValue() {
        return val;
    }

    @Override
    public String toString() {
        return String.format("Fact(%d!,%d)", index, val);
    }
}
