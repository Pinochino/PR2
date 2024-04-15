package person;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private String email;
    private String tel;
    private String address;

    public Person(int id, String name, String dateOfBirth, String email, String tel, String address) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.tel = tel;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        if (isValidateOfBirth(dateOfBirth)) {

            this.dateOfBirth = dateOfBirth;
        } else {
            System.out.println("The date of birth is invalid");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isValidateEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Email is invalid");
        }
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        if (isValidatePhone(tel)) {
            this.tel = tel;
        } else {
            System.out.println("The tel is invalid");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private  static  final Pattern DATE_OF_BIRTH_REGEX = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}");
    private  static  final Pattern EMAIL_REGEX = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$");
    private  static  final Pattern PHONE_REGEX = Pattern.compile("^\\d{10}$");

    public static boolean isValidateOfBirth(String dateOfBirth){
        return  DATE_OF_BIRTH_REGEX.matcher(dateOfBirth).matches();
    }

    public static boolean isValidatePhone(String tel){
        return  PHONE_REGEX.matcher(tel).matches();
    }

    public static boolean isValidateEmail(String email){
        return  EMAIL_REGEX.matcher(email).matches();
    }
    public Integer getAge() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(getDateOfBirth(), formatter);
        return Period.between(birthDate, currentDate).getYears();
    }

}
