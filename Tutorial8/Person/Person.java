 package Tutorial8.Person;

 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.Comparator;
 import java.util.List;

 class Person {

    private int id;
    private String name;
    private String dataOfBirth;
    private String email;
    private String tel;
    private String address;
    private int age;
    public Person(int id, String name, String dataOfBirth, String email, String tel, String address, int age){
        this.id = id;
        this.name = name;
        this.dataOfBirth = dataOfBirth;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.age = age;
    }

     public Person(int id) {
     }

     Person() {
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

     public  String toString(){
         return "Student is: " + getId() + " , with name is " + getName() + " ,with date of birth is " + getDataOfBirth() + ", with age is " + getAge();
     }

     public static void main(String[] args) {
         List<Person> listStudents = new ArrayList<>();
         listStudents.add(new Person(1, "Hung", "22-11-2004", "Hung@gmail.com", "101", "HP", 11));
         listStudents.add(new Person(2, "Huong", "23-11-2004", "Hung@gmail.com", "101", "HP", 24));
         listStudents.add(new Person(3, "Duong", "24-11-2004", "Hung@gmail.com", "101", "HP", 10));
         listStudents.add(new Person(4, "Ngoc", "25-11-2004", "Hung@gmail.com", "101", "HP", 15));

         System.out.println("Sort list student by their name: ");
         Collections.sort(listStudents, new Comparator<Person>() {
             @Override
             public int compare(Person o1, Person o2) {
                 return o1.getName().compareTo(o2.getName());
             }

         });
         for (Person p : listStudents) {
             System.out.println(p);
         }

        System.out.println("Sort list student by their age: ");
        Collections.sort(listStudents, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() < o2.getAge() ? 1 : -1;
            }
        });

        for (Person student : listStudents) {
            System.out.println(student);
        }
     }
}