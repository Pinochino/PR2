import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("data.bin");
        byte[] buffer = new byte[1000];
        int bytesRead = fis.read(buffer);
        System.out.println("Read " + bytesRead + " bytes.");
        System.out.println("There are " + fis.available() + " bytes left.");
        byte[] myBinaryData = new byte[bytesRead];
        System.arraycopy(buffer, 0, myBinaryData, 0, bytesRead);
        System.out.println(
                "Content from file: " +
                        new String(myBinaryData, StandardCharsets.UTF_8)
        );
    }
}
