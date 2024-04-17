package Tutorial8.course;

import java.util.Comparator;

public class creditComparator implements Comparator<Course> {

    @Override
    public int compare(Course o1, Course o2) {
        return o1.getCredits().compareTo(o2.getCredits());
    }
}
