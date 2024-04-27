package Tutorial3.src;

import java.util.Scanner;
public class Product {
    public  String name;
    public double price;
    public double discount;
    public Product(){

    }
    public Product(String name, double price, double discount){
        this.name = name;
        System.out.println("The name of product: " + name);
        this.price = price;
        System.out.println("The price of product: " + price);
        this.discount = discount;
        System.out.println("The discount of product: " + discount);

    }
    public Product(String name2, double price2){
        this.name = name2;
        System.out.println("The name of product2: " + name2);
        this.price = price2;
        System.out.println("The price of product2: " + price2);
    }
    private double getImportTax(double price, double discount){
           return (discount * price)/100;
        }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the price: ");
        price = sc.nextDouble();
        System.out.println("Enter the discount: ");
        discount = sc.nextDouble();
        sc.close();
    }
    public void display() {
        System.out.println("The product name: " + name);
        System.out.println("The price: " + price);
        System.out.println("The discount: " + discount + " %");
        System.out.println("The import tax: " + String.format("%.2f", getImportTax(price, discount)));
    }

    public boolean getImportTax() {
        return true;
    }
}
