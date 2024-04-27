package Tutorial8.src.Course;

import Tutorial8.src.person.Student;

import java.util.ArrayList;
import java.util.List;

public class TestCourse {

    public static void main(String[] args) {
        List<Course> list = new ArrayList<>();
        Student s1 = new Student(1, "Duong", "23/11/2004", "Duong@gmail.com", "0335250189", "HaiPhong", list, 10.6);

        Course c1 = new Course(1, "Information", 320.0, Department.INFORMATION, Semester.AUTUMN, list);
        list.add(c1);
        System.out.println(c1);
    }
}
