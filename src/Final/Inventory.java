package Final;

public class Inventory {
    private String Location;
    private int Current;
    private int Last;
    private int total;
    //default
    public Inventory (){
        Location = "none";
        Current = 0;
        Last = 0;
        total = 0;
    }
    //input new obkect
    public Inventory (String in0, int in1, int in2){
        this.Location = in0;
        this.Current = in1;
        this.Last = in2;
        this.total = this.Current+this.Last;
    }
    //get methods
    //location
    public String getLocation() {return this.Location;}
    //current total Inventory
    public int getCurrent() {return this.Current;}
    //last years Inventory
    public int getLast() {return this.Last;}
    //total Inventory this and last
    public int getTotal() {return this.Current + this.Last;}
    //difrence between this years inventory and last years
    public double getChange() {
        if (Last == 0){
            return 0;
        }
        else {
            return ((double)(Current - Last) / Last) * 100;
        }
    }

    //change methods
    //location
    public String ChangeLocation(String in) { return this.Location = in;}
    //current
    public int ChangeCurrent(int in) {return this.Current = in;}
    //previous year
    public int ChangeLast(int in) {return this.Last = in;}

    //more Inventory
    public int addCurrent (int in) {return this.Current += in;}
    public int subtractCurrent (int in) {return this.Current -= in;}

    //to string
    public String toString (){
        return "Location: " + this.getLocation() + "\nCurrent Inventory: " + this.getCurrent() + "\nLast years inventory: " + this.getLast() + "\ntotal inventory: " + this.getTotal() + "\nDifference: " + this.getChange() + "%";
    }
    public String toString2 (){
        return "Location: " + this.getLocation() + "\t\tCurrent Inventory: " + this.getCurrent() + "\t\tLast years inventory: " + this.getLast() + "\t\ttotal inventory: " + this.getTotal() + "\t\tDifference: " + this.getChange() + "%";
    }
}