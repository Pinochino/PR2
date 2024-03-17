public class Account {

    private int id;
    private String name;
    private String password;
    private AccountStatus Status;
    public Account(int id, String name, String password, AccountStatus Status){
        this.id = id;
        this.name =name;
        this.password = password;
        this.Status = AccountStatus.Active;
    }
    public AccountStatus getStatus() {
        return Status;
    }
    public void setStatus(Account status) {
        Status = status.getStatus();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "The id is: " + id + " ,name is: " +name +" ,and password is: " +password + " ,status: " + Status;
    }
}
