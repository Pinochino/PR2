package Tutorial4.src;

import java.util.Scanner;

public class Product {

    private String name;
    private double price;
    private double discount;

    public Product() {
        
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String productName){
        this.name = productName;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(String priceProduct){
        this.name = priceProduct;
    }

    public double getDiscount(){
        return discount;
    }
    public void setDiscount(double discountProduct){
        this.discount = discountProduct;
    }
    double getImportTax() {
        double importTax = price * discount / 100;
        return importTax;
    }

    public void display() {
        System.out.println("Name of product: " + name);
        System.out.println("price : " + price + " $");
        System.out.println("discount: " + discount + " %");
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of product: ");
        name = sc.nextLine();
        System.out.println("price : ");
        price = sc.nextDouble();
        System.out.println("discount : ");
        discount = sc.nextDouble();
        sc.close();
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.input();
        p1.display();
        System.out.println("The import tax is: " + p1.getImportTax());
    }
}
