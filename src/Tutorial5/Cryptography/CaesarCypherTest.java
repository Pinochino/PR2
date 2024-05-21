package Tutorial5.Cryptography;

public class CaesarCypherTest {

    public static void main(String[] args) {
        CaesarCipher c = new CaesarCipher("aBc", 3);
        c.encrypt();
        System.out.println(c.getCipherText()); // dEf
        c.setCipherText("dEf");
        System.out.println(c.getPlainText()); // aBc
    }
}
