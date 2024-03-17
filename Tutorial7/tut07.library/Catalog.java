import java.util.List;

public class Catalog {
    private int creationDate;
    private List<BookItem> respiratory;

    public Catalog(int creationDate, List<BookItem> respiratory) {
    this.respiratory = respiratory;
    this.creationDate = creationDate;
    }

    public List<BookItem> getRespiratory() {
        return respiratory;
    }

    public void setRespiratory(List<BookItem> respiratory) {
        this.respiratory = respiratory;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

}
