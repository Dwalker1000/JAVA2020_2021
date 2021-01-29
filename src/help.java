public class help {
    public static void main (String [] args){
        int first = 0;
        int second = 1;
        int size = 10;
        int count = 0;
        for (int i = 1; i<=size;i++){
            int print = first+second;
            System.out.println(print);
            if (count == 0) {
                second = first + second;
                count = 1;
            }
            else if (count == 1) {
                first = first + second;
                count =0;
            }
        }
        for (int line = 1; line<= size; line++){
            for (int num = 1; num<= line; num++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
