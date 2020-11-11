//Object class
//object class has no main
//it is used only to identifly or create an object and its behavor
public class point {
    //fields
    private int x = 3;
    private int y = 7;
    private String name; //when we don't define a value by default then it returns null
    //create cunstructors
    public point(){
        x=0;
        y=0;
        name = ("this is the x "+ x+" this is the y "+ y);
    }
    public point(int x1, int y1){
        x=(x1);
        y=(y1);
        name = ("this is the x "+ x+" this is the y "+ y);
    }
    //non static method changing the field values Mutator methods
    public void SetX(int x1){
        x=x1;
    }
    public void SetY(int y1){
        y =y1;
    }
    //non static method object reference has to be made
    //return values Assesor methods
    public int GetX(){
        return x;
    }
    public int GetY(){
        return y;
    }
    public void setLocation(int x1, int y1){
        x=x1;
        y=y1;
        name = ("this is the x "+ x+" this is the y "+ y);
    }
    public void translate(int dx, int dy){
        x += dx;
        y += dy;
        name = ("this is the x "+ x+" this is the y "+ y);
    }
    public String toString(){
        return name;
    }
    public double distance(int x2, int y2){
        double distance1 = Math.sqrt(Math.pow(x2-x,2)+Math.pow(y2-y,2));
        return distance1;
    }
    public String modToString(){
        String main = "[x=" + x + ",y" + y + "]";
        return main;
    }
    //hw
    public int manhattanDistance(int xtwo, int ytwo){
        int x1 = Math.abs(x);
        int y1 = Math.abs(y);
        int x2 = Math.abs(xtwo);
        int y2 = Math.abs(ytwo);
        int xdis = Math.abs(x1-x2);
        int ydis = Math.abs(y1-y2);
        int distance = xdis + ydis;
        return distance;
    }
    public boolean isVertical(int xtwo, int ytwo){
        return xtwo == x;
    }
    public double slope(int x2, int y2){
        if (x2 == x) {
            int agrs = 0;
            throw new IllegalArgumentException("the second x var cannot be the same as the first x var");
        }

        double slope = (y2 - y) / (x2 / x);
        return slope;
    }
    public boolean isCollinear(int x2, int y2, int x3, int y3){
        float slope1 = (y2-y)/(x2/x);
        float slope2 = (y3-y2)/(x3-x2);
        float slope3 = (y-y3)/(x=x3);
        return slope1 == slope2 && slope2 == slope3 && slope3 == slope1;
    }
}
