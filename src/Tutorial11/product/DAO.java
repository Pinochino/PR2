import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class DAO<T> {
    private List<T> source;

    public DAO() {
        source = new ArrayList<>();
    }

    public void add(T obj){
        source.add(obj);
    }

    public void remove(T obj){
        source.remove(obj);
    }

    /**
     * If obj is found in this.source, update this object
     * @param obj the object to be updated
     *
     */
    public  abstract T find(Serializable id);
    public abstract void update(T obj);
    public  List<T> getList(){
        return  source;
    }
}
