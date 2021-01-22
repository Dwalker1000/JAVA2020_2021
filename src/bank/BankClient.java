package bank;

import bank.Bank;

import java.util.*;
public class BankClient {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("whats your name");
        String Name = scan.nextLine();
        System.out.println("Whats your account Type (Saving or Checking)");
        String Type = scan.nextLine();
        System.out.println("Whats your starting balance");
        double startBal = scan.nextInt();
        Bank account = new Bank(Name, Type, startBal);
        System.out.println("whats your Default name");
        String DefaultName = scan.nextLine();
        System.out.println("Whats your Default Type (Saving or Checking)");
        String DefaultType = scan.nextLine();
        Bank Default = new Bank(DefaultName, DefaultType, 1000);
        if (account.getBal() == 0){
            double amount = scan.nextInt();
            account.addBal(amount);
        }
        System.out.println(account.toString());
    }
}
