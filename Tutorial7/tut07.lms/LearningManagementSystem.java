public class LearningManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Hung", "22-11-2004", 5.6);
        Course course1 = new Course(15, "Information Technology", "Research about web dev", 34);
        Course course2 = new Course(16, "Project Management", "Research about how to operate", 30);

        // Ghi danh học viên vào các khóa học
        student1.enroll(course1);
        student1.enroll(course2);

        System.out.println(student1);
        for (Course course : student1.getEnrolledCourses()) {
            System.out.println(course);
        }
    }
}
