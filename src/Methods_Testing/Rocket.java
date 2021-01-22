package Methods_Testing;

public class Rocket {
    public static void main(String[] args) {
        top(); //is a call to the method top
        bot();
        bot();
        top();
    }
    //when you create a method you must create a call from main
    public static void top(){
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }
    public static void bot(){
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }
}
