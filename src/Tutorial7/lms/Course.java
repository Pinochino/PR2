package Tutorial7.lms;

import java.util.ArrayList;
import java.util.List;

public class Course implements Comparable<Course> {
    private final int courseID;
    private final String name;
    private String description;
    private int credit;
    private List<String> academicTranscript = new ArrayList<>();

//	public Course(int courseID, String name, int credit) throws Exception {
//		if (this.isValidCourse(courseID, name, credit)) {
//			this.courseID = courseID;
//			this.name = name;
//			this.credit = credit;
//		}else {
//			throw new Exception("Invalid course details");
//		}
//
//	}

    public Course(int courseID, String name, int credit) throws Exception {
        if (!this.isValidCourseID(courseID)) {
            throw new Exception("Invalid course ID");
        }
        if (!this.isValidName(name)) {
            throw new Exception("Invalid course name");
        }
        if (!this.isValidCredit(credit)) {
            throw new Exception("Invalid course credit");
        }
        this.courseID = courseID;
        this.name = name;
        this.credit = credit;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) throws Exception {
        if (!this.isValidDescription(description)) {
            throw new Exception("Invalid description");
        }
        this.description = description;
    }

    /**
     * @return the credit
     */
    public int getCredit() {
        return this.credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(int credit) throws Exception {
        if (this.isValidCredit(credit)) {
            this.credit = credit;
        } else {
            throw new Exception("Invalid credit");
        }
    }

//	public boolean setCredit(int credit) {
//		if (this.isValidCredit(credit)) {
//			this.credit = credit;
//			return true;
//		} else {
//			return false;
//		}
//	}

    /**
     * @return the academicTranscript
     */
    public List getAcademicTranscript() {
        return this.academicTranscript;
    }

    /**
     * @param academicTranscript the academicTranscript to set
     */
    public void setAcademicTranscript(List academicTranscript) {
        this.academicTranscript = academicTranscript;
    }

    /**
     * @return the courseID
     */
    public int getCourseID() {
        return this.courseID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    private boolean isValidCourseID(int courseID) {
        // Method 01
//		if (courseID >= 1) {
//			return true;
//		} else {
//			return false;
//		}
        // Method 02
        return courseID >= 1; // && - and || - or
    }

    private boolean isValidName(String name) {
        return name != null && name.trim().length() <= 30;
    }

    private boolean isValidDescription(String description) {
        return description != null && description.trim().length() <= 100;
    }

    private boolean isValidCredit(int credit) {
        return credit >= 1 && credit <= 5;
    }

    private boolean isValidCourse(int courseID, String name, int credit) {
        return this.isValidCourseID(courseID) && this.isValidName(name) && this.isValidCredit(credit);
    }

    public boolean repOk(int courseID, String name, int credit, String description) {
        return this.isValidCourse(courseID, name, credit) && this.isValidDescription(description);
    }

    public boolean repOk() {
        return this.isValidCourse(this.getCourseID(), this.getName(), this.getCredit())
                && this.isValidDescription(this.getDescription());
    }

    @Override
    public int compareTo(Course o) {
//		return this.getCredit() - o.getCredit(); // Sorted by credit in ASC order
//		return o.getCredit() - this.getCredit(); // Sorted by credit in DESC order
//		return this.getName().compareTo(o.getName()); // Sorted by name in ASC order
        return o.getName().compareTo(this.getName()); // Sorted by name in DESC order
    }
}

