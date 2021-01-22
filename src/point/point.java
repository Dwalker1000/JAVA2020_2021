package point;

// A Point object represents a pair of (x, y) coordinates.
// Fourth version: encapsulated.
public class point {
    public int x;
    public int y;
    private String name;
    public point() {
        x=0;
        y=0;
        name = "this is the x" + x + "this is the y" + y;
    }
    public point(int x1, int y1) {
        if (x1 < 0 || y1 < 0){
            throw new IllegalArgumentException("can be less that zero");
        }
        else{
            x=x1;
            y=y1;
            name = "this is the x" + x + "this is the y" + y;
        }
        setLocation(x1, y1);
    }
    public double distanceFromOrigin() {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void SetX(int x){
        this.x = x;
    }
    public void SetY(int y){
        this.y = y;
    }
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
        name = "this is the x" + x + "this is the y" + y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public void translate(int x2, int y2) {
        setLocation(x + x2, y + y2);
    }
    //hw
    public int manhattanDistance(point other){
        int xDis = Math.abs(other.x-x);
        int yDis = Math.abs(other.y-y);
        return xDis+yDis;
    }
    public boolean isVertical(point other){
        return other.x == x;
    }
    public double slope(point other){
        if (other.x == x) {
            int agrs = 0;
            throw new IllegalArgumentException("the second x var cannot be the same as the first x var");
        }
        double slope = (other.y - y) / (other.x / x);
        return slope;
    }
    public boolean isCollinear(point other){
        float slope1 = (other.y-y)/(other.x/x);
        float slope2 = (y-other.y)/(y-other.x);
        return slope1 == slope2;
    }
}