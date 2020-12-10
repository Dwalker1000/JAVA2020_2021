package Final;

import java.util.*;
public class Inventory_Client {
    public static Inventory inventory = new Inventory();
    public static int Current_Location = 0;
    public static int Length = 0;
    public static Inventory [] inventory_Array = new Inventory[Length];
    public static void main(String [] args) {
        menu();
    }
    public static void menu(){
        Scanner scan = new Scanner(System.in);
        String Rep = "yes";
        Inventory current = inventory_Array[Current_Location];
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
        inventory = new Inventory(Location, CurrentYear, LastYear);
        inventory_Array[Length] = inventory;
        Length += 1;
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
            for (int i = 0; i<= inventory_Array.length-1; i++){
                System.out.println();
                System.out.print(i + ". ");
                Inventory name = inventory_Array[i];
                System.out.print(name.getLocation());
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
}