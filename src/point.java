// A Point object represents a pair of (x, y) coordinates.
// Fourth version: encapsulated.
public class point {
    public int x;
    public int y;
    // constructs a new point at the origin, (0, 0)
    public point() {
        this(0, 0); // calls Point(int, int) constructor
    }
    // constructs a new point with the given (x, y) location
    public point(int x, int y) {
        setLocation(x, y);
    }
// returns the distance between this Point and (0, 0)
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
        }
    // returns the x-coordinate of this point
    public int getX() {
        return x;
    }
    // returns the y-coordinate of this point
    public int getY() {
    return y;
    }
    // sets this point's (x, y) location to the given values
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // returns a String representation of this point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    // shifts this point's location by the given amount
    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
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