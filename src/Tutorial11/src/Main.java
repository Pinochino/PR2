package Tutorial11.src;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Iphone", 499.2);
        Product p2 = new Product("Xiamo", 399.4);

        ProductDAO productDAO = new ProductDAO();
        productDAO.add(p1);
        productDAO.add(p2);

        Product p = productDAO.find("Iphone");
        System.out.println(p.getPrice());

        Product p3 = new Product("Philip", 360.0);
        productDAO.add(p3);
        productDAO.update(p3);

        p3 = productDAO.find("Philip");
        System.out.println("Update price: " + p3.getPrice());

    }
}
