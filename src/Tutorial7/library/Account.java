package Tutorial7.library;

public class Account {
    private int ID;
    private String password;
    private Status status;

    public Account(int ID, String password, Status status) {
        this.ID = ID;
        this.password = password;
        this.status = Status.Active;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
