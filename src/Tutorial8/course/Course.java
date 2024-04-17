package Tutorial8.course;

import Tutorial8.person.Semester;

public class Course {
    private int courseID;
    private String courseName;
    private Double credits;
    private Department department;
    private Semester semester;

    public Course(int courseID, String courseName, Double credits, Department department, Semester semester) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.credits = credits;
        this.department = department;
        this.semester = semester;
    }

    public Course(int courseID, String informationTechnology, double credits, Department department, Tutorial8.course.Semester semester) {
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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
}
