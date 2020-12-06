package Final;

public class Inventory {
    private String Location;
    private int Current;
    private int Last;
    private int total;
    private int change;

    public Inventory (){
        Location = "none";
        Current = 0;
        Last = 0;
        total = Current+Last;
        if (Last == 0){
            change = 0;
        }
        else {
            change = ((Current / Last)) * 100;
        }
    }
    public Inventory (String in0, int in1, int in2){
        Location = in0;
        Current = in1;
        Last = in2;
        total = in1+in2;
        change = (in1 / in2) * 100;
    }
    //get methods
    //location
    public String getLocation() {return Location;}
    //current total stock
    public int getCurrent() {return Current;}
    //last years stock
    public int getLast() {return Last;}
    //total stock this and last
    public int getTotal() {return total;}
    //change in stock
    public String getChange() {return change + "%";}

    //change methods
    //location
    public String ChangeLocation(String in) { return Location = in;}
    //current
    public int ChangeCurrent(int in) {return Current = in;}
    //previous year
    public int ChangeLast(int in) {return Last = in;}

    //more stock
    public int addCurrent (int in) {return Current += in;}
    public int subtractCurrent (int in) {return Current -= in;}

    //to string
    public String toString (){
        String out = "Location: " + Location + "\nCurrent Inventory: " + Current + "\nLast years inventory: " + Last + "\ntotal inventory: " + total + "\nDifference: " + change;
        return out;
    }
}