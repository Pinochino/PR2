package lect12b.factory;

public class PostgreSQLConnnection implements DBConnection {

    @Override
    public String execute(String query) {
        return "PostgreSQL result";
    }
}
