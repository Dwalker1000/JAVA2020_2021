public class TriangleNumbers {
    public static final int SIZE=7;
    public static void main(String [] args){
        for (int line=1; line< SIZE; line++){
            space(line);
            num(line);
            System.out.println();
        }
    }
    public static void space(int line){
        for (int spc = 1; spc<SIZE - line; spc++){
            System.out.print(' ');
        }
    }
    public static void num(int line){
        for (int num = 1; num<= line; num++){
            System.out.print(line);
        }
    }
}
