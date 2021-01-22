package loops;

public class ForloopPractice {
    public static final int SIZE=7; //static constant (final makes it so you cant change it)
    public static void main(String [] args){
        System.out.println("+----+");
        for (int i = 1; i <= SIZE; i++) {
            line();
        }
        System.out.println("+----+");
    }
    public static void line(){
            System.out.println("\\    /");
            System.out.println("/    \\");
    }
}