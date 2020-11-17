import com.sun.jmx.snmp.internal.SnmpAccessControlModel;

import java.lang.reflect.Type;
import java.util.*;
public class Bank {
    private int accountNum;
    private String owner;
    private String accType;
    private double bal;
    Random random = new Random();
    public Bank(){
        owner = "None";
        accType = "None";
        bal = 0.00;
    }
    public Bank(String Name, String Type, double startbal){
        accountNum = AccountNumber();
        owner = Name;
        accType = Type;
        bal = startbal;
    }
    //account num code
    public int AccountNumber(){
        accountNum = random.nextInt(2147483647);
        return accountNum;
    }
    public int getAccountNum(){
        return accountNum;
    }
    //owner code
    public String setOwner(String input){
        owner = input;
        return owner;
    }
    public String ChangName(String name){
        owner = name;
        return owner;
    }
    public String getOwner(){
        return owner;
    }
    //type code
    public String setType(String in) {
        if (in == "Saving" || in == "Checking") {
            accType = in;
        }
        if (in != "Saving" && in != "Checking"){
            accType = "Not Allowed Type";
        }
        return accType;
    }
    public String changeType(String in){
        accType = in;
        return accType;
    }
    public String getAccType(){
        return accType;
    }
    //balance code
    public double addBal(double add){
        bal += add;
        return bal;
    }
    public double getBal(){
        return bal;
    }
    public String checkBal(){
        String allow = "";
        if (bal > 0){
            allow = "out of funds";
        }
        return allow;
    }
    //toString
    public String toString(){
        String combine = "account number: " + accountNum + "\nOwner: " + owner + "\nAccount Type: " + accType + "\nBalance: " + bal;
        return combine;
    }
    //withdraw function
    public String withdraw(double amount){
        bal -= amount;
        String ret = String.valueOf(bal);
        if (bal < 0){
            bal += amount;
            ret = "Not Enough Money In Account";
        }
        return ret;
    }
    //min fee
    public double fee(){
        if (bal < 200){
            bal -= 10;
        }
        return bal;
    }
    //transfer code
    public String transfer(Bank account, Bank Default, String firstSecond,int amount){
        if (firstSecond == "first"){
            account.bal -= amount;
            Default.bal += amount;
        }
        if (firstSecond == "second"){
            Default.bal -= amount;
            account.bal += amount;
        }
        return "Transaction completed";
    }
}
