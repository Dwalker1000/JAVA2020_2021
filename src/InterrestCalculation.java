import java.util.*;
/*
Daniel Walker
intrest rate = Amount invested*intrest rate/100
 */
public class InterrestCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("whats your initial investment");
        float input = scan.nextFloat();
        System.out.println("how many years do you want this to go on for");
        int years = scan.nextInt();
        System.out.println("whats your intrest rate (dont put it in persent form ex: 5,6.5, 2.3)");
        float intrestRate = scan.nextFloat();
        System.out.println("how many dollars do you want to invest per year");
        float invesymentPerYear = scan.nextFloat();
        for (int x = 1; x <= years; x++) {
            input = input + rateclaculator(input, intrestRate);
            System.out.println("in "+ x+" years you made $"+input);
            input = input + invesymentPerYear;
        }
    }

    public static float rateclaculator(float amount, float intRate) {
        amount = amount * intRate / 100;
        return amount;
    }
}