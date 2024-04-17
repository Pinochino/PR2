import java.io.Serializable;

public class Product<T, V> implements Serializable {
  private T name;
  private V price;

    public Product(T name, V price) {
        this.name = name;
        this.price = price;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public V getPrice() {
        return price;
    }

    public void setPrice(V price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tutorial3.Tutorial4.Product{" +
                "name=" + name +
                ", price=" + price +
                "$}";
    }

    public static void main(String[] args) {
        Tutorial3.Product<String, Double> p1 = new Tutorial3.Product<>("Laptop", 450.0);
        System.out.println(p1);
    }
}
