import java.io.*;

public class IOFile {
    private String filename;

    public IOFile(String filename) {
        this.filename = filename;
    }

    public int countLines() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/TXT/Excersice4.txt"))) {
            int lines = 0;
            while (reader.readLine() != null) {
                lines++;
            }
            return lines;
        }
    }

    public void write(OutputStream os) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/TXT/Excersice4.txt"))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        }
    }

    public void print() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/TXT/Excersice4.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public void copy(String newFilename) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/TXT/Excersice4.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFilename))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
    }

    public void delete() throws IOException {
        File file = new File(filename);
        if (!file.delete()) {
            throw new IOException("Failed to delete the file: " + filename);
        }
    }

    public static void main(String[] args) {
        IOFile file = new IOFile("example.txt");
        try {
            int lineCount = file.countLines();
            System.out.println("Number of lines: " + lineCount);

            System.out.println("Content of the file:");
            file.print();

            System.out.println("Copying file...");
            file.copy("copied_example.txt");

            System.out.println("Deleting file...");
            file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
