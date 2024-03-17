

import java.util.List;
import java.util.ArrayList;

public class Course {
    private int courseID;
    private String name;
    private String description;
    private int credit;
    private List<String> academicTranscript;

    public Course(int courseID, String name, String description, int credit) {
        this.courseID = courseID;
        this.name = name;
        this.description = description;
        this.credit = credit;
        this.academicTranscript = new ArrayList<>();
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
        if (credit < 0) {
            throw new IllegalArgumentException("Credit cannot be negative.");
        }
        this.credit = credit;
    }

    public List<String> getAcademicTranscript() {
        return academicTranscript;
    }

    public void addAcademicTranscriptEntry(String entry) {
        if (entry != null) {
            academicTranscript.add(entry);
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", credit=" + credit +
                '}';
    }
}
