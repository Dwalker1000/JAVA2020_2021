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
        total = 0;
        change = 0;
    }
    public Inventory (String in0, int in1, int in2){
        this.Location = in0;
        this.Current = in1;
        this.Last = in2;
        this.total = this.Current+this.Last;
        if (this.Last == 0){
            this.change = 0;
        }
        else if(this.Last > this.Current){
            this.change = ((this.Last - this.Current)/this.Last)*100;
        }
        else{
            this.change = ((this.Current - this.Last)/this.Last)*100;
        }
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
    //change in Inventory
    public int getChange() {
        int x;
        if (Last == 0){
            x = 0;
        }
        else if (Last > Current){
            x = ((Last - Current)/Last)*100;
        }
        else{
            x = ((Current - Last)/Last)*100;
        }
        return x;
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
        return "Location: " + this.Location + "\nCurrent Inventory: " + this.Current + "\nLast years inventory: " + this.Last + "\ntotal inventory: " + this.total + "\nDifference: " + this.change + "%";
    }
}