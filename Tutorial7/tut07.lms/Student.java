import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentID;
    private String name;
    private String dateOfBirth;
    private double gpa;
    private List<Course> enrolledCourses;

    public Student(int studentID, String name, String dateOfBirth, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gpa = gpa;
        this.enrolledCourses = new ArrayList<>();
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    // Phương thức để ghi danh học viên vào khóa học
    public void enroll(Course course) {
        enrolledCourses.add(course);
    }

    public String toString() {
        return "The name of student is " + name + " ,and ID: " + studentID + " ,date: " + dateOfBirth + " ,and gpa: "
                + gpa + " ,have attended " + this.enrolledCourses.size() + " courses.";
    }
}
