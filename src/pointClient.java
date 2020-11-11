public class pointClient {
    public static void main(String[]args){
        point p1 = new point(); //new  keyword to create object
        point p2 = new point(3,2);
        p2.SetY(5);
//        System.out.println("the point is p1: (" + p1.GetX() + "," + p1.GetY()+ ")");
//        System.out.println("the point is p2: (" + p2.GetX() + "," + p2.GetY()+ ")");
        p1.setLocation(-5,6);
//        System.out.println("the point is p1: (" + p1.GetX() + "," + p1.GetY()+ ")");
        System.out.println(p1);
    }
}
