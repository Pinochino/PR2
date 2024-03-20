package Tutorial8.Person;

import java.util.*;

public class Student extends Person {
    private List<String> enrolledCourses;
    private double gpa;
    private int studentId;

    public Student(int id, String name, String dataOfBirth, String email, String tel, String address, int age) {
        super(id, name, dataOfBirth, email, tel, address, age);
    }

    Student(int studentId, List<String> enrolledCourses, double gpa){
        this.studentId = studentId;
        this.enrolledCourses = enrolledCourses;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<String> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
    @Override
    public  String toString(){
        return "Id is : " + getStudentId() + " has attend course " + getEnrolledCourses() + " ,has archived " + getGpa();
    }
    public static void main(String[] args) {
        List<String> c1 = new ArrayList<>(Arrays.asList("IT", "Travel"));
        List<String> c2 = new ArrayList<>(Arrays.asList("assistant", "auditor"));
        List<String> c3 = new ArrayList<>(Arrays.asList("cashier", "businessman "));
        List<String> c4 = new ArrayList<>(Arrays.asList("salesperson", "mailman"));


        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student(1, c1 , 4.5));
        listStudents.add(new Student(2, c2, 2.3));
        listStudents.add(new Student(3, c3, 3.5));
        listStudents.add(new Student(4, c4, 1.5));

        System.out.println("The list of student are sorted by GPA");
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return a.getGpa() < b.getGpa() ? 1 : -1;
            }
        });

        Iterator<Student> iterator = listStudents.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student);
        }
    }







}
