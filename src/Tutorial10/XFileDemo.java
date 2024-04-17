package Tutorial10;

import Tutorial10.XFile;

public class XFileDemo {
    public static void main(String[] args) {
        byte[] data = XFile.read("D:/Workspace/JAVA/PR2/TXT/Ex1.txt");
        XFile.write("D:/Workspace/JAVA/PR2/TXT/C1.txt",data);
    }
}
