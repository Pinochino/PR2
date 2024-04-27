package Tutorial9.lect09;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FRFWDemo {
    public static void main(String[] args) {
        File filename = new File("first.txt");
        try {
            // writing
            FileWriter out = new FileWriter(filename);
            out.write("Xin chào \uD83D\uDE97 các bạn sinh viên FIT HANU. Chúc vui vẻ!");
            out.write("\n");
            out.write("Character Streams");
            out.close();
            // reading
            FileReader input = new FileReader(filename);
            System.out.println("Read from first.txt");
            int ch = input.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = input.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
