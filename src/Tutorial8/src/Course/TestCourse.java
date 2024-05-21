package Tutorial8.src.Course;

import Tutorial8.src.person.Student;

import java.util.ArrayList;
import java.util.List;

public class TestCourse {

    public static void main(String[] args) throws Exception {
        List<Course> list = new ArrayList<>();
        Student s1 = new Student(1, "2201040080", "Hung", "22/11/2004");

        Course c1 = new Course(1, "Information", 320.0, Department.INFORMATION, Semester.AUTUMN, list);
        list.add(c1);
        System.out.println(c1);
        System.out.println(s1);

    }
}
