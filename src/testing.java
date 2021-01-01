import java.util.*;

public class testing {
    public static void main(String[] args){
        Random random = new Random();
        for (int i =0; i<=100; i++) {
            int rad = random.nextInt(2);
            System.out.println(rad);
        }
    }
}