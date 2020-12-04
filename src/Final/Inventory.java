package Final;

public class Inventory {
    private String Location;
    private int Current;
    private int Last;
    private int total;
    private int change;

    public Inventory (){
        Location = "null";
        Current = 0;
        Last = 0;
        total = Current+Last;
        change = (Current/Last)*100;
    }
    public Inventory (String in0, int in1, int in2){
        Location = in0;
        Current = in1;
        Last = in2;
        total = Current+Last;
        change = (Current/Last)*100;
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
    public int getChange() {return change;}

    //change methods
    //location
    public String changeLocation(String in) { return Location = in;}
    //current
    public int ChangeCurrent(int in) {return Current = in;}
    //previous year
    public int ChangeLast(int in) {return Last = in;}

    //more stock
    public int addCurrent (int in) {return Current += in;}
    public int subtractCurrent (int in) {return Current -= in;}

    //to string
    public String toString (){
        String out = Location + Current + Last + total + change;
        return out;
    }
}