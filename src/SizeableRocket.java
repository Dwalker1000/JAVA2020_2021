public class SizeableRocket {
    public static final int SIZE = 5;
    public static void main(String [] args){

        for (int line=1; line< SIZE; line++) {
            space(line);
            cone(line);
        }
        acros();
        for (int line=1; line< SIZE/2+1; line++) {
            toptri(line);
        }
        for (int line=0; line< SIZE/2; line++) {
            bottri(line);
        }
        acros();
        for (int line=0; line< SIZE/2; line++) {
            bottri(line);
        }
        for (int line=1; line< SIZE/2+1; line++) {
            toptri(line);
        }
        acros();
        for (int line=1; line< SIZE; line++) {
            space(line);
            cone(line);
        }
    }
    public static void cone(int line){
        for (int cone = 1; cone<= line; cone++){
            System.out.print('/');
        }
        System.out.print("**");
        for (int cone = 1; cone<= line; cone++){
            System.out.print('\\');
        }
        System.out.println(" ");
    }
    public static void acros(){
        System.out.print("+");
        for (int cone = 1; cone<= SIZE; cone++){
            System.out.print("=*");
        }
        System.out.println("+");
    }
    public static void toptri(int line) {
        System.out.print("|");
        for(int dot = 1; dot <= SIZE-(line+(SIZE/2)); dot++) {
            System.out.print(".");
        }
        for (int slash = 0; slash < line; slash++) {
            System.out.print("/\\");
        }
        for(int dot = 1; dot <= SIZE-line*2; dot++) {
            System.out.print(".");
        }
        for (int slash = 0; slash < line; slash++) {
            System.out.print("/\\");
        }
        for(int dot = 1; dot <= SIZE-(line+(SIZE/2)); dot++) {
            System.out.print(".");
        }
        System.out.println("|");
    }
    public static void bottri(int line){
        System.out.print("|");
        for(int dot = 1; dot <= line; dot++) {
            System.out.print(".");
        }
        for (int slash = 0; slash < SIZE-(SIZE/2)-line; slash++) {
            System.out.print("\\/");
        }
        for(int dot = 1; dot <= line; dot++) {
            System.out.print("..");
        }
        for (int slash = 0; slash < SIZE-(SIZE/2)-line; slash++) {
            System.out.print("\\/");
        }
        for(int dot = 1; dot <= line; dot++) {
            System.out.print(".");
        }
        System.out.println("|");
    }
    public static void space(int line){
        for (int spc = 0; spc<SIZE - line; spc++){
            System.out.print(' ');
        }
    }
}
