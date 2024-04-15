package lect12b.factory;

public class MySQLConnection implements DBConnection{

    @Override
    public String execute(String query) {
        return "MySQL result";
    }
}
