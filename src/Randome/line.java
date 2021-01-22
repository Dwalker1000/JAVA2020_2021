package Randome;

import point.point;

public class line {
    private point p1;
    private point p2;
    public line(point p1, point p2){
        p1 = new point();
        p2 = new point();
    }
    public point getp1(){
        int x = getp1().getX();
        int y = getp1().getY();
        return new point(x,y);
    }
    public point getp2(){
        int x = getp2().getX();
        int y = getp2().getY();
        return new point(x,y);
    }
    public String toString(){
        String Line = "[" + getp1() + ", "+ getp2()+ "]";
        return Line;
    }
    public double getSlope(){
        double slope = (getp2().y-getp1().y)/(getp2().x-getp1().x);

        return slope;
    }
    public line(int x1, int y1, int x2, int y2){
        point p1 = new point(x1,y1);
        point p2 = new point(x2,y2);
    }
    public boolean isCollinear(point p){
        double line2slope = ((p.y-getp1().y)/(p.x-getp1().y));
        return line2slope == getSlope();
    }
}
