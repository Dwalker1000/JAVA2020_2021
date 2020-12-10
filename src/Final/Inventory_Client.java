package Final;

import java.io.*;
import java.util.*;
public class Inventory_Client {
    public static Inventory inventory = new Inventory();
    public static int Current_Location = 0;
    public static int Length = 0;
    public static Inventory [] inventory_Array = new Inventory[10000000];
    public static int count = 0;
    public static void main(String [] args) throws FileNotFoundException {
        menu();
    }
    public static void menu() throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        String Rep = "yes";
        Inventory inventory = new Inventory();
        inventory_Array[Length] = inventory;
        Inventory current = inventory_Array[Current_Location];
        FileArrayAdd();
        do{
            System.out.println("************************************");
            System.out.println("*               menu               *");
            System.out.println("*                                  *");
            System.out.println("* 1. Create New Inventory          *");
            System.out.println("* 2. Location Settings             *");
            System.out.println("* 3. Current Inventory Settings    *");
            System.out.println("* 4. Previous Year Settings        *");
            System.out.println("* 5. Get Total Inventory this+last *");
            System.out.println("* 6. Get Inventory Difference      *");
            System.out.println("* 7. Get Data                      *");
            System.out.println("* 8. exit                          *");
            System.out.println("************************************");
            int answer = scan.nextInt();
            switch(answer) {
                case 1:
                    Length += 1;
                    NewInventory(scan);
                    break;
                case 2:
                    Location(scan, current);
                    break;
                case 3:
                    CurrentInventory(scan, current);
                    break;
                case 4:
                    PastInventory(scan, current);
                    break;
                case 5:
                    System.out.println("the total inventory from both is: " + current.getTotal());
                    break;
                case 6:
                    System.out.println("the difference between this years inventory and last years: " + current.getChange() + "%");
                    break;
                case 7:
                    System.out.println(current.toString());
                    break;
                case 8:
                    StoreData();
                    Rep = "no";
                    break;
                default:

            }
        }while (Rep == "yes");
    }
    public static void NewInventory(Scanner scan){
        System.out.println("where is the warehouse located");
        String Location = scan.next();
        System.out.println("what is your total inventory this year");
        int CurrentYear = scan.nextInt();
        System.out.println("what was your total inventory last year");
        int LastYear = scan.nextInt();
        count += 1;
        inventory = new Inventory(Location, CurrentYear, LastYear);
        inventory_Array[Length] = inventory;
    }

    public static void Location(Scanner scan,Inventory current){
        System.out.println("do you want to change the name of the location(1), change current location(2), or see(3) the locations name");
        int answer = scan.nextInt();
        if (answer == 1){
            System.out.println("what do you want to Change it to");
            String change = scan.next();
            current.ChangeLocation(change);
        }
        if (answer == 2){
            System.out.println("witch one do you want to access?");
            for (int i = 0; i<= count; i++){
                System.out.print(i + ". ");
                Inventory name = inventory_Array[i];
                System.out.print(name.getLocation());
                System.out.println();
            }
            int access = scan.nextInt();
            if (access > inventory_Array.length) {
                System.out.println("not one of the options");
            }
            else{
                Current_Location = access;
            }
        }
        else{
            System.out.println(current.getLocation());
        }
    }

    public static void CurrentInventory (Scanner scan, Inventory current){
        System.out.println("do you want to Change(1), Add(2), remove(3), or See(4) the Inventory");
        int answer = scan.nextInt();
        if (answer == 1){
            System.out.println("what do you want to change it to");
            int change = scan.nextInt();
            current.ChangeCurrent(change);
        }
        if (answer == 2){
            System.out.println("how much do you want to add to the current inventory");
            int change = scan.nextInt();
            current.addCurrent(change);
        }
        if (answer == 3){
            System.out.println("how much do you want to remove from this years inventory");
            int change = scan.nextInt();
            current.subtractCurrent(change);
        }
        else{
            System.out.println(current.getCurrent());
        }
    }

    public static void PastInventory(Scanner scan, Inventory current){
        System.out.println("do you want to change(1) last years inventory or see(2) it");
        int answer = scan.nextInt();
        if (answer == 1){
            System.out.println("what do you want to change last years inventory to");
            int change = scan.nextInt();
            current.ChangeLast(change);
        }
        else{
            System.out.println(current.getLast());
        }
    }

    public static void StoreData()throws FileNotFoundException {
        PrintStream File = new PrintStream("C:\\Users\\walkerd24\\IdeaProjects\\JAVA2020_2021\\src\\Final\\Past_Inventory");
        // Stores file contents
//        if (count == 0){}
//        else {
            for (int i = 0; i <= count; i++) {
                Inventory add = inventory_Array[i + 1];
                String line = add.getLocation() + " " + add.getCurrent() + " " + add.getLast();
                File.println(line);
            }
//        }
    }
    public static void FileArrayAdd () throws FileNotFoundException {
        //gets file contents
        Scanner input = new Scanner(new File("C:\\Users\\walkerd24\\IdeaProjects\\JAVA2020_2021\\src\\Final\\Past_Inventory"));
        int i = 1;
        while (input.hasNextLine()) {
            String Split = input.nextLine();
            String[] arrOfStr = Split.split(" ");
            if (arrOfStr.length <3){

            }
            else {
                String add1 = arrOfStr[0];
                int add2 = Integer.parseInt(arrOfStr[1]);
                int add3 = Integer.parseInt(arrOfStr[2]);
                Inventory inventory = new Inventory(add1, add2, add3);
            }
        }
    }
}