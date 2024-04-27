package Tutorial8.src.person;

import Tutorial8.src.Course.Course;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

    private  Integer studentId;
    private List<Course> enrolledCourses;
    private Double gpa;
    private String nameStudent;

    public Student(Integer studentId, String nameStudent, String dateOfBirth, String email, String tel, String address,  List<Course> enrolledCourses, Double gpa) {
        super(studentId, nameStudent, dateOfBirth, email, tel, address);
        enrolledCourses = new ArrayList<>();
        this.gpa = gpa;
    }

//    public Student(Integer studentId, String nameStudent, Double gpa) {
//        super();
//        this.studentId = studentId;
//        this.gpa = gpa;
//        this.nameStudent = nameStudent;
//    }

    public Integer getStudentId() {
        return studentId;
    }

    public  List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses( List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", enrolledCourses=" + enrolledCourses +
                ", gpa=" + gpa +
                '}';
    }
}
