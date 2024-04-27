package src;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private static final int MIN_INDEX = 1;
    private Integer index;
    private Integer val;
    private static List<Fibonacci> stateStruc;

    private Fibonacci(int n) {
        this.index = n;
        if (n == 1) {
            val = 0;
        } else if (n == 2) {
            val = 1;
        } else {
            Fibonacci prev1 = lookUp(n - 1);
            Fibonacci prev2 = lookUp(n - 2);

            if (prev1 == null) prev1 = new Fibonacci(n - 1);
            if (prev2 == null) prev2 = new Fibonacci(n - 2);

            val = prev1.val + prev2.val;
        }
        stateStruc.add(this);
    }

    public static Fibonacci get(int index) {
        if (index < MIN_INDEX) return null;
        if (stateStruc == null) stateStruc = new ArrayList<>();
        Fibonacci me = lookUp(index);
        if (me == null) me = new Fibonacci(index);
        return me;
    }

    private static Fibonacci lookUp(int n) {
        if (stateStruc != null && n <= stateStruc.size()) {
            return stateStruc.get(n - 1);
        }
        return null;
    }

    public int getValue() {
        return val;
    }

    @Override
    public String toString() {
        return String.format("Fibonacci(%d) = %d", index, val);
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            Fibonacci fib = Fibonacci.get(i);
            System.out.println(fib);
        }
    }
}
