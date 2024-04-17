package Tutorial1;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
public class Activity5 {

    public static int findNumber(ArrayList<Integer> price, ArrayList<Integer> quality) {
        int sum = 0;
        for (int i = 0; i < quality.size(); i++) {
            sum += price.get(i) * quality.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        String path = "PR2/Tutorial1/input.txt";
        File name = new File(path);
        try {
            Scanner input = new Scanner(name);
            ArrayList<Integer> arrayPrice = new ArrayList<>();
            ArrayList<Integer> arrayQuality = new ArrayList<>();

            while (input.hasNext()) {
                int price = input.nextInt();
                arrayPrice.add(price);

                int quality = input.nextInt();
                arrayQuality.add(quality);
            }

            int sumO = findNumber(arrayPrice, arrayQuality);
            System.out.println("Sum: " + sumO);
            input.close();
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    
    }
}

