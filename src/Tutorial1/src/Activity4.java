package Tutorial1.src;

public class Activity4 {
    public static void main(String[] args) {
        // double principal = 17000 equal double principal = 17000.0
        int principal = 17000;
        double rate = 0.07;
        double interest = principal * rate;
        System.out.println("The interest earned is: ");
        System.out.println(interest);
        // Khi mà principal là integer thì ta phải cho tổng của của cả principal và interest dạng thô int
        principal =(int) (principal + interest);
        System.out.println("The value of the investment after one year is ");
        System.out.println(principal);        
    }
}
