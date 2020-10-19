import java.util.*;
/*
Daniel Walker
intrest rate = Amount invested*intrest rate/100
 */
public class InterrestCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("whats your initial investment");
        double input = scan.nextDouble();
        System.out.println("how many years do you want this to go on for");
        int years = scan.nextInt();
        System.out.println("whats your intrest rate (dont put it in persent form ex: 5,6.5, 2.3)");
        double intrestRate = scan.nextDouble();
        System.out.println("how many dollars do you want to invest per year");
        double invesymentPerYear = scan.nextDouble();
        for (int x = 1; x <= years; x++) {
            input = input + rateclaculator(input, intrestRate) + invesymentPerYear;
            System.out.println("after "+ x + " years you will have $" + (float)input + " in your savings");
        }
    }

    public static double rateclaculator(double amount, double intRate) {
        amount = amount * intRate / 100;
        return amount;
    }
}