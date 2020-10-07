import java.util.Scanner;
public class Stairs {
    public static int SIZE;
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("how many stairs do you want");
        SIZE = input.nextInt();
        System.out.println("your Size is " + SIZE);
        for (int line = 0; line < SIZE; line++) {
            for (int spc = 1; spc <= 1; spc++){
                for (int ln = 1; ln<=5; ln++) {
                    space(line);
                }
                head();
                for (int num = 1; num<= line; num++) {
                    System.out.print("     ");
                }
                System.out.print("*");
                System.out.println(" ");
            }
            for (int spc = 1; spc <= 1; spc++){
                for (int ln = 1; ln<= 5; ln++) {
                    space(line);
                }
                mid();
                for (int num = 0; num<= line; num++) {
                    System.out.print("     ");
                }
                System.out.print("*");
                System.out.println(" ");
            }
            for (int spc = 1; spc <= 1; spc++){
                for (int ln = 1; ln<= 5; ln++) {
                    space(line);
                }
                low();
                for (int num = 0; num<= line; num++) {
                    System.out.print("     ");
                }
                System.out.print("*");
                System.out.println(" ");
            }
        }
        bot();
    }
    public static void space(int line){
        for (int spc = 1; spc< SIZE - line; spc++){
            System.out.print(" ");

        }
    }
    public static void head() {
        System.out.print("  o  ******");
    }
    public static void mid() {
        System.out.print(" /|\\ *");
    }
    public static void low() {
        System.out.print(" / \\ *");
    }

    public static void bot(){
        for(int bot = 1; bot<=SIZE*5+7; bot++){
            System.out.print('*');
        }
    }
}
