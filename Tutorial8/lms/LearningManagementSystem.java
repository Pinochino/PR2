package Tutorial8.lms;

import Tutorial8.Course.Course;
import Tutorial8.Person.Student;

import java.util.HashMap;
import java.util.Map;

public class LearningManagementSystem {
    private HashMap<Integer, Student> studentMap;
    private HashMap<Integer, Course> courseMap;
    private int  studentIdCounter= 1;
    private int courseIdCounter = 1;
    private int id;

    public int getStudentIdCounter() {
        return studentIdCounter;
    }

    public void setStudentIdCounter(int studentIdCounter) {
        this.studentIdCounter = studentIdCounter;
    }

    public int getCourseIdCounter() {
        return courseIdCounter;
    }

    public void setCourseIdCounter(int courseIdCounter) {
        this.courseIdCounter = courseIdCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int generateStudentId(){
        return studentIdCounter++;
    }
    public HashMap<Integer, Student> getStudentMap() {
        return studentMap;
    }
    public int generateCourseId() {
        return courseIdCounter++;
    }
    public void setStudentMap(HashMap<Integer, Student> studentMap) {
        this.studentMap = studentMap;
    }

    public HashMap<Integer, Course> getCourseMap() {
        return courseMap;
    }

    public void setCourseMap(HashMap<Integer, Course> courseMap) {
        courseMap = courseMap;
    }

    public void addStudent(Integer a, Student b){
        studentMap.put(a, b);
    }

    public void addStudent(Student student){
        int id = generateStudentId();
        student.setId(id);
        studentMap.put(id, student);
    }

    public void addCourse(Course course){
        int id = generateStudentId();
        course.setCourseId(id);
        courseMap.put(id, course);
    }

    public void removeStudent(int studentId){
        studentMap.remove(studentId);
    }

    public void removeCourse(int courseId){
        studentMap.remove(courseId);
    }
    public static void main(String[] args) {
        Map<Integer, Student> studentMap1 = new HashMap<>();

    }

}
