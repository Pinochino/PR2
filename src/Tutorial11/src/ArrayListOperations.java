package Tutorial11.src;

import java.util.ArrayList;

public class ArrayListOperations {
    private ArrayList<Object> store;

    public ArrayListOperations() {
        this.store = new ArrayList<Object>();
    }

    public ArrayList<Object> getArrayList() {
        return this.store;
    }

    public void addInteger(int number) {
        this.store.add(number);
    }

    public void addDouble(double number) {
        this.store.add(number);
    }

    public void addBoolean(boolean bool) {
        this.store.add(bool);
    }

    public void addString(String str) {
        this.store.add(str);
    }

    public String toString() {
        String result = "";
        for (Object object : store) {
            result += object + " ";
        }
        return result;
    }
}
