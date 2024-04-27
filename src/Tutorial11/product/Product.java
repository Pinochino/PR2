package Tutorial11.product;

import java.io.Serializable;

public class Product implements Serializable {
  private String name; // not null, not empty, length <= 80
  private Double price; // not null, not negative

    public Product(String name, Double price) {
        if (!validateName(name)){
            throw new RuntimeException("Cannot create Product: invalid name ( " + name + " )" );
        }
        this.name = name;
        if (!validatePrice(price)){
            throw new RuntimeException("Cannot create Product: invalid price ( " + price + " )" );
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (validateName(name)){
            this.name = name;
        }
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(Double price) {
        if (validatePrice(price)) {
            this.price = price;
        }
    }

    private boolean validateName(String name){
        return name != null && !name.isEmpty() && name.length() <= 80;
    }

    private boolean validatePrice(Double price){
        return price != null && price >= 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name=" + name +
                ", price=" + price +
                "$}";
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 450.0);
        System.out.println(p1);
    }
}
