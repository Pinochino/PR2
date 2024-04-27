package Tutorial7.lms;

import Tutorial10.src.Student;

import java.util.List;

public class Course {
    private int courseID;
    private String name;
    private String description;
    private int credit;
    private List<Student> academicTranscript;

    public Course(int courseID, String name, String description, int credit, List<Student> academicTranscript) {
        this.courseID = courseID;
        this.name = name;
        this.description = description;
        this.credit = credit;
        this.academicTranscript = academicTranscript;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public List<Student> getAcademicTranscript() {
        return academicTranscript;
    }

    public void setAcademicTranscript(List<Student> academicTranscript) {
        this.academicTranscript = academicTranscript;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", credit=" + credit +
                ", academicTranscript=" + academicTranscript +
                '}';
    }
}
