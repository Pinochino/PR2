package Tutorial2.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Activity3 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
        File file = new File("test1data.txt");
        PrintWriter writer = new PrintWriter(file);
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        writer.println(text);
        writer.println(a);
        writer.println(b);
        writer.println(c);
        writer.close();
        Scanner input = new Scanner(file);
        int count = 0;
            int sum = 0; 
            while(input.hasNext()){
                if (input.hasNextDouble()){
                   double num = input.nextDouble();
                   sum += num;
                   count++;
                } else {
                    input.next();
                }
            }
            input.close();
            if (count > 0) {
                int average = sum / count;
                System.out.println("Average: " + average);
            } else {
                System.out.println("No valid integers found in the file.");
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
