import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private double mark;
    private String faculty;
    private List<Student> studentList;

    public Student(String name, double mark, String faculty) {
        this.name = name;
        this.mark = mark;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Tuan", 5, "CNTT"));
        list.add(new Student("Cuong", 7.5, "TKTW"));
        list.add(new Student("Hanh", 8.5, "CNTT"));
        XFile.writeObject("D:/Workspace/JAVA/TXT/Student.txt    ", list);
    }
}
