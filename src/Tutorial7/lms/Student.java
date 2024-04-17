import  java.util.List;
public class Student {

    private int studentID;
    private String name;
    private  String dateOfBirth;
    private double gpa;
    private List<Course> enrolledCourses;

    public Student(int studentID, String name, String dateOfBirth, double gpa, List<Course> enrolledCourses) {
        this.studentID = studentID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gpa = gpa;
        this.enrolledCourses = enrolledCourses;
    }

    public int getStudentID() {
        return studentID;
    }

//    public void setStudentID(int studentID) {
//        this.studentID = studentID;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

//    public void setDateOfBirth(String dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if ((gpa >= 0.0) && (gpa <= 10.0)) {
            this.gpa = gpa;
        }
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    @Override
    public String toString() {
        return "Tutorial10.Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gpa=" + gpa +
                ", enrolledCourses=" + enrolledCourses +
                '}';
    }
}
