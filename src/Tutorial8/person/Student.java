package Tutorial8.person;


import java.util.List;

public class Student extends Person {
    private int studentID;
    private List<Course> enrolledCourses;
    private Double Gpa;

    public Student(int id, String name, String dateOfBirth, String email, String tel, String address, int studentID, List<Course> enrolledCourses, Double gpa) {
        super(id, name, dateOfBirth, email, tel, address);
        this.studentID = studentID;
        this.enrolledCourses = enrolledCourses;
        Gpa = gpa;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public Double getGpa() {
        return Gpa;
    }

    public void setGpa(Double gpa) {
        Gpa = gpa;
    }


}
