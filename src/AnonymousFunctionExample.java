/**
 * Created by cameronoakley on 10/26/15.
 */
public class AnonymousFunctionExample {
    public static void main(String[] args) {
        sayHello();//run code from seperate method

        //run code from anonymous class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from an anonymous class");
            }
        };
        r1.run();

        //run code from anonymous function
        Runnable r2 = () -> {
            System.out.println("Hello from an anonymous function");
        };
        r2.run();
    }
    static void sayHello(){
        System.out.println("Hello from a seperate method");
    }
}
