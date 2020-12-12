package Final;

import java.io.*;
import java.util.*;
public class Inventory_Client {
    //inventory object
    public static Inventory inventory = new Inventory();
    //location in array of objects (what object your currently editing)
    public static int Current_Location = 0;
    //place where it adds new object in array
    public static int Length = 0;
    //array
    public static Inventory [] inventory_Array = new Inventory[10000000];
    //amount of objects in array
    public static int count = 0;
    //main
    public static void main(String [] args) throws FileNotFoundException {
        menu();
    }
    //menu
    public static void menu() throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        String Rep = "yes";
        Inventory inventory = new Inventory();
        inventory_Array[Length] = inventory;
        Inventory current = inventory_Array[Current_Location];
        FileArrayAdd();
        do{
            System.out.println("*********************************************");
            System.out.println("*                   menu                    *");
            System.out.println("* create new inventories and find different *");
            System.out.println("*     stats based on those inventories      *");
            System.out.println("*                                           *");
            System.out.println("* 1. Create New Inventory                   *");
            System.out.println("* 2. Location Settings                      *");
            System.out.println("* 3. Current Inventory Settings             *");
            System.out.println("* 4. Previous Year Settings                 *");
            System.out.println("* 5. Get Total Inventory this+last          *");
            System.out.println("* 6. Get Inventory Difference               *");
            System.out.println("* 7. Get Data                               *");
            System.out.println("* 8. Gets Data of all inventories           *");
            System.out.println("* 9. exit                                   *");
            System.out.println("*********************************************");
            int answer = scan.nextInt();
            switch(answer) {
                case 1:
                    //creates new inventory and it to the array
                    Length += 1;
                    NewInventory(scan);
                    break;
                case 2:
                    //location settings and if they change location then it switches the current inventory to the index
                    Location(scan, current);
                    current = inventory_Array[Current_Location];
                    break;
                case 3:
                    //settings for the current inventory
                    CurrentInventory(scan, current);
                    break;
                case 4:
                    //setting for previous inventory
                    PastInventory(scan, current);
                    break;
                case 5:
                    //get the total:  total = current inventory + last inventory
                    System.out.println("the total inventory from both is: " + current.getTotal());
                    break;
                case 6:
                    //gets the difference between the previous year and the current years inventory
                    double change = current.getChange();
                    System.out.println("the difference between this years inventory and last years: " + change + "%");
                    break;
                case 7:
                    //gets data for the object
                    System.out.println(current.toString());
                    break;
                case 8:
                    //gets data for all objects in array
                    totalData();
                    break;
                case 9:
                    //stores data and ends program
                    StoreData();
                    Rep = "no";
                    break;
                default:

            }
        }while (Rep == "yes");
    }
    public static void NewInventory(Scanner scan){
        //gets data from person
        System.out.println("where is the warehouse located");
        String Location = scan.next();
        System.out.println("what is your total inventory this year");
        int CurrentYear = scan.nextInt();
        System.out.println("what was your total inventory last year");
        int LastYear = scan.nextInt();
        //ads new data to inventory then to array
        count += 1;
        inventory = new Inventory(Location, CurrentYear, LastYear);
        inventory_Array[Length] = inventory;
    }

    public static void Location(Scanner scan,Inventory current){
        //Different location settings
        System.out.println("1. change name of current location \n2. change witch location you want to edit \n3. see current inventories name");
        int answer = scan.nextInt();
        //changes name of location
        if (answer == 1){
            System.out.println("what do you want to the location too");
            String change = scan.next();
            current.ChangeLocation(change);
        }
        //changes the inventory that you are editing
        if (answer == 2){
            System.out.println("what Location do you want to edit?");
            for (int i = 0; i<= count; i++){
                System.out.print(i + ". ");
                Inventory name = inventory_Array[i];
                System.out.print(name.getLocation());
                System.out.println();
            }
            Current_Location = scan.nextInt();
        }
        //prints location
        else{
            System.out.println(current.getLocation());
        }
    }

    public static void CurrentInventory (Scanner scan, Inventory current){
        System.out.println("1. change current inventory \n2. add inventory to current inventory \n3. remove inventory from current inventory \n4. see how much inventory is in current inventory");
        int answer = scan.nextInt();
        //changes current inventory
        if (answer == 1){
            System.out.println("what do you want to change it to");
            int change = scan.nextInt();
            current.ChangeCurrent(change);
        }
        //adds to current inventory
        if (answer == 2){
            System.out.println("how much do you want to add to the current inventory");
            int change = scan.nextInt();
            current.addCurrent(change);
        }
        //subtracts from current inventory
        if (answer == 3){
            System.out.println("how much do you want to remove from this years inventory");
            int change = scan.nextInt();
            current.subtractCurrent(change);
        }
        //prints current inventory
        else{
            System.out.println(current.getCurrent());
        }
    }

    public static void PastInventory(Scanner scan, Inventory current){
        System.out.println("1. change last years inventory \n2. see last years inventory");
        int answer = scan.nextInt();
        //changes last years inventory
        if (answer == 1){
            System.out.println("what do you want to change last years inventory to");
            int change = scan.nextInt();
            current.ChangeLast(change);
        }
        //print last years inventory
        else{
            System.out.println(current.getLast());
        }
    }

    public static void StoreData()throws FileNotFoundException {
        //stores data
        //opens file
        PrintStream File = new PrintStream("C:\\Users\\walkerd24\\IdeaProjects\\JAVA2020_2021\\src\\Final\\Past_Inventory.txt");
        Inventory noName = inventory_Array[0];
        //if the inventory at the index of 0 is named none then it doesn't get added
        if (noName.getLocation() == "none"  || count > 0){
            for (int i = 0; i <= count-1; i++) {
                Inventory add = inventory_Array[i+1];
                String line = add.getLocation() + " " + add.getCurrent() + " " + add.getLast();
                File.println(line);
            }
        }
        //adds everything to file in format of Name -- Current inventory -- last years inventory
        else {
            for (int i = 0; i <= count; i++) {
                Inventory add = inventory_Array[i];
                String line = add.getLocation() + " " + add.getCurrent() + " " + add.getLast();
                File.println(line);
            }
        }
    }
    public static void FileArrayAdd () throws FileNotFoundException {
        //gets file contents
        Scanner input = new Scanner(new File("C:\\Users\\walkerd24\\IdeaProjects\\JAVA2020_2021\\src\\Final\\Past_Inventory.txt"));
        //checks if their is another line to the file
        while (input.hasNextLine()) {
            String FileIN = input.nextLine();
            //splits next line by its spaces
            String[] arrOfStr = FileIN.split(" ");
            String add1 = arrOfStr[0];
            //changes string number to int
            int add2 = Integer.parseInt(arrOfStr[1]);
            int add3 = Integer.parseInt(arrOfStr[2]);
            //adds to inventory
            count += 1;
            Length += 1;
            Inventory inventory = new Inventory(add1, add2, add3);
            inventory_Array[Length] = inventory;
        }
    }
    public static void totalData(){
        //prints all data from the array
        for (int i = 0; i<= count; i++){
            Inventory name = inventory_Array[i];
            System.out.print(name.toString2());
            System.out.println();
        }
    }
}