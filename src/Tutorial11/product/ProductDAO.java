import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class ProductDAO extends  DAO<Product>{

    @Override
    public Product find(Serializable id) {
        if (id instanceof String){
            String name = (String) id;
            for (Product p : getList()) {
                if (p.getName().equals(name)){
                    return p;
                }
            }
        }
        return null;
    }



    @Override
    public void update(Product obj) {
        Product p = find(obj.getName());
        if (p != null){
            p.setPrice(obj.getPrice());
        }
    }


}
