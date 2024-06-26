package Tutorial5.Person;

public class Student extends Person {
    private final String program;
    private int year;
    private double fee;

    Student(String name, String address, String program, double fee, int year) {
        super(name, address);
        this.program = program;
        this.fee = fee;
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return  super.toString() + " ,program = " + program  + " ,year = " + year + " ,fee = " + fee + "]";
    }

    public static void main(String[] args) {
       Student s1 = new Student("Gang", "HaiPhong", "Counting ", 300, 4);
        System.out.println(s1);
    }
}
