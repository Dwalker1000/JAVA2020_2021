import java.io.*;
import java.util.*;
public class FileWork {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\Users\\walkerd24\\IdeaProjects\\JAVA2020_2021\\src\\Test.txt"));
        Scanner scan = new Scanner(System.in);
        System.out.println("How long is your longest word? (digits)");
        int length = scan.nextInt();
        for (int m = 1; m <= length+4; m++){
            System.out.print("*");
        }
        System.out.println();
        while (input.hasNextLine()) {
            String x = input.next();
            System.out.println("| " + rightPadding(x,length) + " |");
        }
        for (int m = 1; m <= length+4; m++){
            System.out.print("*");
        }
    }
    public static String rightPadding(String input, int L) {
        String result = String.format("%" + (-L) + "s", input);
        return result;
    }
}