package Tutorial8.src.person;

import java.util.regex.Pattern;

public class Person {
    private final Integer id;
    private String name;
    private String dateOfBirth;
    private String email;
    private String tel;
    private String address;
    private Integer age;

    public Person(Integer id, String name, String dateOfBirth, String email, String tel, String address, Integer age)  {


            this.id = id;
            this.name = name;
            this.dateOfBirth = dateOfBirth;
            this.email = email;
            this.tel = tel;
            this.address = address;
            this.age = age;

    }

    public Person(Integer id, String name, String dateOfBirth, String email, String tel, String address) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.tel = tel;
        this.address = address;

    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        if (validateDateOfBirth(dateOfBirth)) {
            this.dateOfBirth = dateOfBirth;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validateEmail(email)){
            this.email = email;
        }
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        if (validateTel(tel)){
            this.tel = tel;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public static final String  EMAIL_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    public static boolean validateEmail(String emailAddress) {
        return Pattern.compile(EMAIL_PATTERN)
                .matcher(emailAddress)
                .matches();
    }

    public static final String TEL_PATTERN = "^\\\\d{10}$";
    public static boolean validateTel(String emailAddress) {
        return Pattern.compile(TEL_PATTERN)
                .matcher(emailAddress)
                .matches();
    }

    public static final String DATE_PATTERN = "dd/MM/yyyy";
    public static boolean validateDateOfBirth(String emailAddress) {
        return Pattern.compile(DATE_PATTERN)
                .matcher(emailAddress)
                .matches();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
