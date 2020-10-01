public class DiamondBox {
    public static final int SIZE=4;
    public static void main(String [] args){
    line();
    top();
    bot();
    line();
    }
    public static void line(){
        System.out.print('#');
        for(int line = 1; line <= SIZE*SIZE; line++){
            System.out.print('=');
        }
        System.out.println('#');
    }
    public static void top (){
        for (int topside = 1; topside <= SIZE; topside++) {
            System.out.print('|');
            for (int space = 1; space <= -2*topside+SIZE*2; space++) {
                System.out.print(' ');
            }
            for (int shape = 1; shape <= 1; shape++) {
                System.out.print("<>");
            }
            for (int dot = 1; dot<= 4*topside-SIZE; dot++){
                System.out.print('.');
            }
            for (int shape = 1; shape <= 1; shape++) {
                System.out.print("<>");
            }
            for (int space = 1; space <= -2*topside+SIZE*2; space++) {
                System.out.print(' ');
            }
            System.out.println('|');
        }
    }
    public static void bot(){
        for(int botside = 1; botside <= SIZE; botside++){
            System.out.print("|");
            for (int Space = 1; Space <= 2*botside-SIZE/2; Space++){
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 1; dot <= -4*botside+4*SIZE; dot++){
                System.out.print(".");
            }
            System.out.print("<>");
            for (int Space = 1; Space <= 2*botside-SIZE/2; Space++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
