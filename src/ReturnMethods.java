import java.util.*;
/*
we are going to learn about return varuables
ask for 2 points
calculate the distance d = sqrt ((x1-x2)^2+(y1-y2)^2)
 */
public class ReturnMethods {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me your first point x, and y");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Give me your second point x, and y");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        double distance = distanceMethod(x1,x2,y1,y2);//my method has to be of type double
        System.out.printf("The double distance is %.2f \n3",distance);
    }
    //this is a return method
    public static double distanceMethod(int X1, int X2,int Y1,int Y2){
        double distance = Math.sqrt(Math.pow((X2-X1),2)+Math.pow((Y2-Y1),2));
        return distance; // to return value to main you can only return value
    }
}
