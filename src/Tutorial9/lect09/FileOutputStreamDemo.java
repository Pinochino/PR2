import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("data.bin");
        String s = "Xin chào các bạn sinh viên FIT HANU. Chúc vui vẻ!";
        fos.write(s.getBytes(StandardCharsets.UTF_8));
        fos.close();
    }
}
