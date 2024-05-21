package Tutorial8.src.person;

public class Person {
    private final int id;
    private String name;
    private final String dateOfBirth;
    private String email;
    private String tel;
    private String address;

    public Person(int id, String name, String dateOfBirth) throws Exception {
        if (!isValidId(id)) {
            throw new Exception("Invalid ID");
        }
        if (!isValidName(name)) {
            throw new Exception("Invalid Name");
        }
        if (!isValidDateOfBirth(dateOfBirth)) {
            throw new Exception("Invalid Date of Birth");
        }
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) throws Exception {
        if (!isValidName(name)) {
            throw new Exception("Invalid Name");
        }
        this.name = name.trim();
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) throws Exception {
        if (!isValidEmail(email)) {
            throw new Exception("Invalid Email");
        }
        this.email = email.trim();
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return this.tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) throws Exception {
        if (!isValidTel(tel)) {
            throw new Exception("Invalid Phone Number");
        }
        this.tel = tel.trim();
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) throws Exception {
        if (!isValidAddress(address)) {
            throw new Exception("Invalid Address");
        }
        this.address = address.trim();
    }

    /**
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    private boolean isValidId(int id) {
        return id >= 1;
    }

    private boolean isValidName(String name) {
        return !isEmptyString(name) && name.trim().length() <= 70 && name.matches("^[a-zA-Z\\s]*$");
    }

    private boolean isValidDateOfBirth(String dateOfBirth) {
        return !isEmptyString(dateOfBirth) && dateOfBirth.trim().length() == 10
                && dateOfBirth.trim().matches("^(0[1-9]|[12][0-9]|3[01])[-/.](0[1-9]|1[012])[-/.](19|20|21)\\d{2}$");
    }

    private boolean isValidEmail(String email) {
        return !isEmptyString(email) && email.trim().length() <= 100
                && email.trim().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    private boolean isValidTel(String tel) {
        return !isEmptyString(tel) && tel.trim().length() >= 10 && tel.trim().length() <= 12
                && tel.trim().matches("^(84|0)[2-9]\\d{8}$");
    }

    private boolean isValidAddress(String address) {
        return !isEmptyString(address) && address.trim().length() <= 100 && address.trim().matches("^\\w+$");
    }

    public boolean isEmptyString(String str) {
        return str == null || str.trim().equals("") || str.trim().equals(" ");
    }

    private boolean isValidPerson(int id, String name, String dateOfBirth) {
        return this.isValidId(id) && this.isValidName(name) && this.isValidDateOfBirth(dateOfBirth);
    }

    @Override
    public String toString() {
        return "Person [id=" + this.getId() + ", name=" + this.getName() + ", dateOfBirth=" + this.getDateOfBirth()
                + ", email=" + this.getEmail() + ", tel=" + this.getTel() + ", address=" + this.getAddress() + "]";
    }
}