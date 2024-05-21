package Tutorial7.lms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Doctor
 * mutable(studentID) = F /\ optional(studentID) = F /\
 *
 */
public class Student {
    private int studentID;
    private String name;
    private String dateOfBirth;
    private double gpa;
    private List enrolledCourses = new ArrayList<>();

    /**
     * @param studentID
     * @param name
     * @param dob
     * @throws Exception
     */
    public Student(int studentID, String name, String dob) throws Exception {
        if (this.isValidStudent(studentID, name, dob)) {
            this.studentID = studentID;
            this.name = name;
            this.dateOfBirth = dob;
        }else {
            throw new Exception("Invalid Student attributes");
        }
    }

    /**
     * @return the gpa
     */
    public double getGpa() {
        return this.gpa;
    }

    /**
     * @param gpa the gpa to set
     *
     */
//	public boolean setGpa(double gpa) {
//		if (isValidGpa(gpa)) {
//			this.gpa = gpa;
//			return true;
//		}else {
//			return false;
//		}
//	}

    /**
     * @param gpa
     * @throws Exception
     */
    public void setGpa(double gpa) throws Exception {
        if (isValidGpa(gpa)) {
            this.gpa = gpa;
        } else {
            throw new Exception("Invalid GPA");
        }
    }

    /**
     * @return the enrolledCourses
     */
    public List getEnrolledCourses() {
        return this.enrolledCourses;
    }

    /**
     * @param enrolledCourses the enrolledCourses to set
     */
    public void setEnrolledCourses(List enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    /**
     * @return the studentID
     */
    public int getStudentID() {
        return this.studentID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param studentID
     * @return return true if student ID is greater than 0
     * 			else return false
     */
    private boolean isValidStudentID(int studentID) {
//		if(studentID > 0) {
//			return true;
//		}else {
//			return false;
//		}
        return studentID > 0;
    }

    /**
     * @param name
     * @return return true if student name has length smaller than or equal to 50
     */
    private boolean isValidName(String name) {
        return name != null && name.length() <= 50;
    }

    /**
     * @param dateOfBirth
     * @return return true if date of birth has format: dd/mm/yyyy or dd-mm-yyyy or dd.mm.yyyy
     * @Regex_refs: https://www.phpliveregex.com/
     */
    private boolean isValidDateOfBirth(String dateOfBirth) {
        return dateOfBirth != null && dateOfBirth.matches("^(0[1-9]|[12][0-9]|3[01])[-/.](0[1-9]|1[012])[-/.](19|20|21)\\d{2}$");
    }

    /**
     * @param gpa
     * @return return true if the gpa is between 0.0 and 10.0
     */
    private boolean isValidGpa(double gpa) {
        return gpa >= 0.0 && gpa <= 10.0;
    }

    /**
     * @param studentID
     * @param name
     * @param dateOfBirth
     * @return return true if student id, name and date of birth are valid
     */
    public boolean isValidStudent(int studentID, String name, String dateOfBirth) {
        return this.isValidStudentID(studentID) && this.isValidName(name)
                && this.isValidDateOfBirth(dateOfBirth);
    }

    /**
     * @param studentID
     * @param name
     * @param gpa
     * @param dateOfBirth
     * @return return true if all student attributes are valid
     */
    public boolean repOk(int studentID, String name, double gpa, String dateOfBirth) {
        return this.isValidStudentID(studentID) && this.isValidName(name) && this.isValidGpa(gpa)
                && this.isValidDateOfBirth(dateOfBirth);
    }
}
