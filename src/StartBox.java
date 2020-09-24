public class StartBox {
    public static void main(String [] args){
        int Size = ForloopPractice.SIZE;
        for (int line = 1; line <=Size; line++){
            mybox(line);
        }
    }
    public static void mybox (int newline){
        for (int star=1; star <=newline; star++){
            makespace(star);
            System.out.print(newline);
        }
        System.out.println();
    }
    public static void makespace (int line){
        for (int space = 1; space >= line; space--){
            System.out.print(" ");
        }
    }
}
