package Tutorial10.src;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
    private String name;
    private Double grade;
    private String field;

    public Student(String name, Double grade, String field) {
        this.name = name;
        this.grade = grade;
        this.field = field;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }


    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Tuấn", 5.0, "CNTT"));
        list.add(new Student("Cường ", 7.5, "TWK"));
        list.add(new Student("Hạnh", 8.5, "CNTT"));
        XFile.writeObject("D:/Workspace/JAVA/PR2/TXT/Ex2.txt", list);
    }


}
