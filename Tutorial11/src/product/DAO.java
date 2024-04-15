package product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class DAO<Entity> {
    private List<Entity> data;

    public DAO() {
        data = new ArrayList<>();
    }

    public List<Entity> getList() {
        return data;
    }

    public void add(Entity entity) {
        data.add(entity);
    }

    public void remove(Entity entity) {
        data.remove(entity);
    }

    public abstract void update(Entity entity);

    public abstract Entity find(Serializable id);
}
