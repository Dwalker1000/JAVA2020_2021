public class NestedLoops {
    public static final int SIZE=7;
    public static void main(String [] args){
        for (int x = 1; x<= SIZE; x++){
            for (int dot= SIZE-1; dot>=x; dot--) {
                System.out.print('.');
            }
            System.out.println(x);
        }
    }
    public static void tri(String [] args){
        for(int x=1; x<= SIZE; x++){
            for(int dot=SIZE-1; dot>= x; dot--){
                System.out.print('.');
            }
            System.out.println(x);
            for (int space=1; space < 2 * x - SIZE+3;space++){
                System.out.print(' ');
            }
            if(x != 1) {
                System.out.println(x);
            }
            else
                System.out.println();
        }
    }
}
