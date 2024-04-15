package lect12b.singleton;

public class DBConnection {
    private static DBConnection instance;

    private DBConnection() {

    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public static void main(String[] args) {
        DBConnection con = DBConnection.getInstance();

    }
}
