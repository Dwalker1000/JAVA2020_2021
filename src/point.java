//Object class
//object class has no main
//it is used only to identifly or create an object and its behavor
public class point {
    //fields
    private int x = 3;
    private int y = 7;
    //create cunstructors
    public point(){
        x=-1;
        y=-1;
    }
    public point(int x1, int y1){
        x=Math.abs(x1);
        y=Math.abs(y1);
    }
    //non static method changing the feild values Mutator methods
    public void SetX(int x1){
        x=x1;
    }
    public void SetY(int y1){
        y =y1;
    }
    //non static method object refrence has to be made
    //return values Assesor methods
    public int GetX(){
        return x;
    }
    public int GetY(){
        return y;
    }
}
