package person;

import course.Course;

import java.util.ArrayList;
import java.util.List;

public class testStudent {
    public static void main(String[] args) {

        List<Course> listCourse = new ArrayList<>();
        Course c1 = new Course(1, "Information", 350.0, Department.INFORMATION, Semester.AUTUMN);
        Course c2 = new Course(2, "English", 470.0, Department.ENGLISH, Semester.AUTUMN);
        Course c3 = new Course(3, "Accounting", 160.0, Department.ACCOUNT, Semester.AUTUMN);

        listCourse.add(c1);
        listCourse.add(c2);
        listCourse.add(c3);

        List<Student> listStudent = new ArrayList<>();
        Student s1 = new Student(1, "Thai", "24/06/2021", "Thai@gmail.com", "0332120304", "HP", 1, listCourse, 3.6 );
        Student s2 = new Student(3, "Duong", "21/07/1976", "Thai@gmail.com", "0332120304", "HP", 3, listCourse, 3.2 );
        Student s3 = new Student(2, "Phuong", "24/06/1977", "Thai@gmail.com", "0332120304", "HP", 2, listCourse, 4.7 );

        listStudent.add(s1);
        listStudent.add(s2);
        listStudent.add(s3);

        listStudent.sort(new GpaComparator());
        System.out.println("Sort by GPA: ");
        for (Student student: listStudent) {
            System.out.println(student.getName() + " " + student.getGpa());
        }
    }
}
