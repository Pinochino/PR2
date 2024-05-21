package Tutorial8.src.person;

import Tutorial8.src.Course.Course;

import java.util.ArrayList;
import java.util.List;


public class Student extends Person {
    private String studentID;
    private double gpa;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(int id, String studentID, String name, String dateOfBirth) throws Exception {
        super(id, name, dateOfBirth);
        if (!isValidStudentID(studentID)) {
            throw new Exception("Invalid Student ID");
        }
        this.studentID = studentID;
    }

    /**
     * @return the gpa
     */
    public double getGpa() {
        return this.gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(double gpa) throws Exception {
        if (!isValidGpa(gpa)) {
            throw new Exception("Invalid GPA");
        }
        this.gpa = gpa;
    }

    /**
     * @return the enrolledCourses
     */
    public List<Course> getEnrolledCourses() {
        return this.enrolledCourses;
    }

    /**
     * @param enrolledCourses the enrolledCourses to set
     */
    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return this.studentID;
    }

    private boolean isValidStudentID(String studentID) {
        return !super.isEmptyString(studentID) && studentID.trim().length() <= 10 && studentID.trim().matches("^\\w+$");
    }

    private boolean isValidGpa(double gpa) {
        return gpa >= 0 && gpa <= 4.0;
    }

    public void enroll(Course course) throws Exception {
        if (!this.enrolledCourses.contains(course)) {
            this.enrolledCourses.add(course);
        } else {
            throw new Exception("Already enrolled this course!");
        }
    }

    @Override
    public String toString() {
        return "Student [" + super.toString() + ", studentID=" + this.getStudentID() + ", gpa=" + this.getGpa()
                + ", enrolledCourses=" + this.getEnrolledCourses().size() + "]";
    }
}

