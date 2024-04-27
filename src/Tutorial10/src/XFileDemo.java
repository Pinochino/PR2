package Tutorial10.src;

import Tutorial10.src.XFile;

public class XFileDemo {
    public static void main(String[] args) {
        byte[] data = XFile.read("D:/Workspace/JAVA/PR2/TXT/Ex1.txt");
        XFile.write("D:/Workspace/JAVA/PR2/TXT/C1.txt",data);
    }
}
