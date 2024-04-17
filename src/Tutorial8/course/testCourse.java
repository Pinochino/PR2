package Tutorial8.course;


import java.util.ArrayList;
import java.util.List;

public class testCourse {
    public static void main(String[] args) {
        List<Course> listCourse = new ArrayList<>();

        Course c1 = new Course(1, "Information Technology", 350.0, Department.INFORMATION, Semester.AUTUMN);
        Course c2 = new Course(2, "English", 470.0, Department.ENGLISH, Semester.SPRING);
        Course c3 = new Course(3, "Accounting", 160.0, Department.ACCOUNT, Semester.WINTER);

        listCourse.add(c1);
        listCourse.add(c2);
        listCourse.add(c3);

        // Sort by name
        System.out.println("\n");
        listCourse.sort(new nameCourseComparator());
        System.out.println("Sort by Name: ");
        for (Course course : listCourse) {
            System.out.println(course.getCourseName());
        }


        // Sort by credits
        System.out.println("\n");
        listCourse.sort(new creditComparator());
        System.out.println("Sort by Credit: ");

        for (Course course : listCourse) {
            System.out.println(course.getCourseName() + " " + course.getCredits()  );
        }

        // Sort by department
        System.out.println("\n");
        listCourse.sort(new departmentComparator());
        System.out.println("Sort by Department: ");

        for (Course course : listCourse) {
            System.out.println(course.getDepartment());
        }
        System.out.println("\n");

        // Sort by semester
        listCourse.sort(new semesterComparator());
        System.out.println("Sort by Semester: ");

        for (Course course : listCourse) {
            System.out.println(course.getSemester());
        }
    }
}
