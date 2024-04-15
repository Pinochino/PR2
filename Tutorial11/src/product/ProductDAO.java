package product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO<Product extends  DAO>{
    private List<Product> list;
    private Serializable id;

    public ProductDAO() {
        super();
    }

    public void update(Product p1){
        for (int i = 0; i < list.size() ; i++) {
            list.add(p1);
        }
    }
    public Product find(Product p1){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == p1){
                return p1;
            }
        }
        return null;
    }
}
