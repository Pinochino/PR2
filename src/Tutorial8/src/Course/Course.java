package Tutorial8.src.Course;

import Tutorial8.src.person.Student;

import java.util.ArrayList;
import java.util.List;

public class Course implements StudentManageable {
    private final Integer courseId;
    private String name;
    private Double credits;
    private Department department;
    private Semester semester;
    private final List<Student> enrolledCourses;

    public Course(Integer courseId, String name, Double credits, Department department, Semester semester, List<Course> enrolledCourses) {
        this.courseId = courseId;
        this.name = name;
        this.credits = credits;
        this.department = department;
        this.semester = semester;
        this.enrolledCourses =  new ArrayList<>();
    }

    public List<Student> getEnrolledCourses() {
        return enrolledCourses;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCredits() {
        return credits;
    }

    public void setCredits(Double credits) {
        this.credits = credits;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    @Override
    public void addStudent(Student student) {
        this.enrolledCourses.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.enrolledCourses.remove(student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", department=" + department +
                ", semester=" + semester +
                ", enrolledCourses=" + enrolledCourses +
                '}';
    }
}
