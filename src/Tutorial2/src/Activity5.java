package Tutorial2.src;// Muốn đổi từ số thập phân sang hệ nhị phân
// Cách 1: Dùng method Integer.toBinaryString(number);
// Cách 2: Tự triển khai
import java.util.Scanner;
public class Activity5 {
    public static int lowestCommon(int a, int b) {
        // int binary1[] = new int[40];
        // int binary2[] = new int[40];
        // int numOne = 0;
        // System.out.println("The bit of number " + a + " is: ");
        // while (a > 0) {
        //     binary1[numOne++] = a % 2;
        //     a = a / 2;
        // }
        // for (int i = numOne - 1; i >= 0; i--) {
        //     System.out.print(binary1[i]);
        // }
        // System.out.println("\n" + "The bit of number " + b + " is: ");
        // int numTwo = 0;
        // while (b > 0) {
        //     binary2[numTwo++] = b % 2;
        //     b = b / 2;
        // }
        // for (int i = numTwo - 1; i >= 0; i--) {
        //     System.out.print(binary2[i]);
        // }
        // System.out.println("\n" + "The position of ");
        // int count = 0;
        // for(int i = binary1.length; i >= 0; i--){
        //     if(binary1[i] != binary2[i]){
        //         count++;
        //     }
        // }
        // return count;
        String n = Integer.toBinaryString(a);
    String m = Integer.toBinaryString(b);

    int minLen = Math.min(n.length(), m.length());
    int position = 0;

    // Loop from the rightmost bit
    for (int i = 1; i <= minLen; i++) {
        char bitA = n.charAt(n.length() - i);
        char bitB = m.charAt(m.length() - i);

        if (bitA != bitB) {
            // The first differing bit is found
            break;
        }

        position++;
    }

    return position;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        int d = input.nextInt();
        int result = lowestCommon(c, d);
        System.out.println(result);
        input.close();
    }
}
