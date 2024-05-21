package Tutorial8.src.Course;

import java.util.Comparator;

public class CreditComparator implements Comparator<Course> {
    @Override
    public int compare(Course o1, Course o2) {
        return (int) (o1.getCredits()-o2.getCredits());
    }
}
