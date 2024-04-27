package Tutorial9.IntegersSum;

import Tutorial9.IntegersSum.EmptyLineException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntergersNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("The elements of array is: ");
        for (int i = 0; i < n ; i++) {
            a[i] += sc.nextInt();
        }

        try {
            validateNumberLength(a);
            validateNumberFormat(a);
            System.out.println(sumOfArray(a));
        } catch (EmptyLineException | NumberFormatException e){
            System.out.println("Can not calculate the sum of array ");
        }
    }
    public static int sumOfArray(int[] a){
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        return  sum;
    }
    private static void validateNumberLength(int[] a) throws EmptyLineException {
        int n = a.length;
        if((n == 0) || hasOnlyOneZero(a)){
            throw  new EmptyLineException("The length of array is null, or has only 0");
        }
    }
    private static void validateNumberFormat(int[] a) throws NumberFormatException{
        Pattern pattern = Pattern.compile("^\\d+$");
        for (int i = 0; i < a.length; i++) {
            Matcher matcher = pattern.matcher(Integer.toString(a[i]));
            if (!matcher.matches()){
                throw new NumberFormatException("non-numeric characters or multiple spaces between integers");
            }
        }
    }
    private static boolean hasOnlyOneZero(int[] a) {
        int count = 0;
        for (int j : a) {
            if (j == 0) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return count == 1;
    }
}
