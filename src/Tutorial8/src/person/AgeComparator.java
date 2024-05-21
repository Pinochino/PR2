package Tutorial8.src.person;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int[] personBirthday1 = castStringArrayToIntArray(parseDateToArray(o1.getDateOfBirth()));
        int[] personBirthday2 = castStringArrayToIntArray(parseDateToArray(o2.getDateOfBirth()));
        int yearCompare = personBirthday1[2] - personBirthday2[2];
        int monthCompare = personBirthday1[1] - personBirthday2[1];
        int dateCompare = personBirthday1[0] - personBirthday2[0];

        if (yearCompare == 0) {
            if (monthCompare == 0) {
                return dateCompare;
            }else {
                return monthCompare;
            }
        }else {
            return yearCompare;
        }
    }

    private String[] parseDateToArray(String date) {
        if (date.contains(".")) {
            return date.split(".");
        } else if (date.contains("/")) {
            return date.split("/");
        } else if (date.contains("-")) {
            return date.split("-");
        }
        return null;
    }

    private int[] castStringArrayToIntArray(String[] strArr) {
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }
}
