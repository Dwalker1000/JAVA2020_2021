public class SizeAbleGlassThing {
    public static final int SIZE=6;
    public static void main(String [] args) {
        line();
        top();
    }
    public static void line(){
        System.out.print("+");
        for(int line = 1; line <= SIZE*2; line++){
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
    }
    public static void top() {
        for (int x = 1; x <= SIZE; x++) {
            System.out.print("|");
            for (int space = 1; space <= -x + SIZE; space++) {
                System.out.print(" ");
            }
            System.out.println();
            for (int dot = 1; dot <= 2 * x - 2; dot++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
    }
}
