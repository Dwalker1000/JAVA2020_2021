package Final;
import java.util.*;
public class Inventory_Client {
    public Inventory inventory = new Inventory();
    public static void main(String [] args) {
        menu();
    }
    public static void menu(){
        Inventory inventory = new Inventory();
        Scanner scan = new Scanner(System.in);
        String Rep = "yes";
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
                    NewInventory(scan, inventory);
                    break;
                case 2:
                    Location(scan, inventory);
                    break;
                case 3:
                    CurrentInventory(scan, inventory);
                    break;
                case 4:
                    PastInventory(scan, inventory);
                    break;
                case 5:
                    System.out.println("the total inventory from both is: " + inventory.getTotal());
                    break;
                case 6:
                    System.out.println("the difference between this years inventory and last years: " + inventory.getChange());
                    break;
                case 7:
                    System.out.println(inventory.toString());
                    break;
                case 8:
                    Rep = "no";
                    break;
                default:

            }
        }while (Rep == "yes");
    }
    public static void NewInventory(Scanner scan, Inventory inventory){
        System.out.println("where is the warehouse located");
        String Location = scan.next();
        inventory.ChangeLocation(Location);
        System.out.println("what is your total inventory this year");
        int CurrentYear = scan.nextInt();
        inventory.ChangeCurrent(CurrentYear);
        System.out.println("what was your total inventory last year");
        int LastYear = scan.nextInt();
        inventory.ChangeLast(LastYear);
        Inventory inventory1 = new Inventory(Location, CurrentYear, LastYear);
    }
    public static void Location(Scanner scan, Inventory inventory){
        System.out.println("do you want to change(1) the locations name or see(2) it");
        int answer = scan.nextInt();
        if (answer == 1){
            System.out.println("what do you want to Change it to");
            String change = scan.next();
            inventory.ChangeLocation(change);
        }
        else{
            System.out.println(inventory.getLocation());
        }
    }
    public static void CurrentInventory (Scanner scan, Inventory inventory){
        System.out.println("do you want to Change(1), Add(2), remove(3), or See(4) the Inventory");
        int answer = scan.nextInt();
        if (answer == 1){
            System.out.println("what do you want to change it to");
            int change = scan.nextInt();
            inventory.ChangeCurrent(change);
        }
        if (answer == 2){
            System.out.println("how much do you want to add to the current inventory");
            int change = scan.nextInt();
            inventory.addCurrent(change);
        }
        if (answer == 3){
            System.out.println("how much do you want to remove from this years inventory");
            int change = scan.nextInt();
            inventory.subtractCurrent(change);
        }
        else{
            System.out.println(inventory.getCurrent());
        }
    }
    public static void PastInventory(Scanner scan, Inventory inventory){
        System.out.println("do you want to change(1) last years inventory or see(2) it");
        int answer = scan.nextInt();
        if (answer == 1){
            System.out.println("what do you want to change last years inventory to");
            int change = scan.nextInt();
            inventory.ChangeLast(change);
        }
        else{
            System.out.println(inventory.getLast());
        }
    }
}