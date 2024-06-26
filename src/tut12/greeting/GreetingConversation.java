package tut12.greeting;

public class GreetingConversation {

    private static GreetingConversation INSTANCE;
    private GreetingConversation(){}
    public static GreetingConversation getInstance(){
        if (INSTANCE == null){
            INSTANCE = new GreetingConversation();
        }
        return INSTANCE;
    }

    public void run() {
        Person p1 = new Person(1, "Quan Dang");
        Person p2 = new Person(2, "Thuan Nguyen");
        MobilePhone m1 = new MobilePhone("Apple", "M-ABC-123", Color.Yellow, 2008, false);
        MobilePhone m2 = new MobilePhone("Apple", "M-DUX-872", Color.Red, 2021, true);
        p1.setPhone(m1);
        p2.setPhone(m2);
        p1.greet();
        p2.greet();
        System.out.println(p1);
        System.out.println(p2);
        // TODO: test more methods (all the public ones)
    }

    public static void main(String[] args){
        GreetingConversation gc = GreetingConversation.getInstance();
        gc.run();
    }
}
