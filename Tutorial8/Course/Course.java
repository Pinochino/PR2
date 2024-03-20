package Tutorial8.Course;

import Tutorial8.Course.Department;
import Tutorial8.Person.Student;

import java.util.*;

public class Course implements StudentManageable{
    private int courseId;
    private String name;
    private double credits;
    private Department department;
    private Semester semester;
    private List<Student> enrolledStudents;

    public Course(int courseId, String name, double credits, Department department, Semester semester) {
        this.courseId = courseId;
        this.name = name;
        this.credits = credits;
        this.department = department;
        this.semester = semester;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
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
        enrolledStudents.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }

    public void updateStudent(Student student){
        for (int i = 0; i < enrolledStudents.size(); i++) {
            if (enrolledStudents.get(i).getStudentId() == enrolledStudents.getFirst().getId()){
                enrolledStudents.set(i, student);
                return;
            }
        }
    }

    public  String toString(){
        return "Id is " + getCourseId() + " ,with name is " + getName() + " ,credits is " + getCredits() + " $, has attended " + getDepartment() + " in the " + getSemester();
    }
    public static void main(String[] args) {
        List<Course> Courses = new ArrayList<>();
        Courses.add(new Course(1, "Information Technology", 150, Department.ART, Semester.AUTUMN ));
        Courses.add(new Course(2, "Travel", 340, Department.HISTORY, Semester.SPRING));
        Courses.add(new Course(3, "Japanese", 150, Department.MATH, Semester.WINTER ));
        Courses.add(new Course(4, "English", 450, Department.LITERATURE, Semester.AUTUMN ));

        System.out.println("Courses are sorted by name ");
        Collections.sort(Courses, new Comparator<Course>() {
            @Override
            public int compare(Course c1, Course c2) {
                return c1.getName().compareTo(c2.getName());
            }
        });

        Iterator<Course> iterator = Courses.iterator();
        while (iterator.hasNext()){
            Course course = iterator.next();
            System.out.println(course);
        }
    }

}
