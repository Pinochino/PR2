package Tutorial4;

import Tutorial3.Product;

import java.util.Scanner;
public class testProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of product: ");
        String name = sc.nextLine();
        System.out.println("price : ");
        double price = sc.nextDouble();
        System.out.println("discount : ");
        double discount = sc.nextDouble();
        Product p1 = new Product(name, price, discount);
        p1.display();
        System.out.println(p1.getImportTax());
        sc.nextLine();
        System.out.println("Name of product2: ");
        String name2 = sc.nextLine();
        System.out.println("price2 : ");
        double price2 = sc.nextDouble();
        System.out.println(p1.getImportTax());
        Product p2 = new Product(name2, price2);
        p2.display();
        sc.close();
    }
}
