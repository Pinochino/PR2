package lect12b.factory;

public class DBFactory {
    public static DBConnection getDBConnection() {
        return new PostgreSQLConnnection();
    }
}
