import java.util.*;
public class PlayingWithRandom {
    public static void main(String [] args){
        game();
    }
    public static void randy(){
        //create random object
        Random randy = new Random();
        int num1 = randy.nextInt(100)+1;// the limit is not included
        System.out.println("your number is = " + num1);
        while (num1 != 100){
            System.out.println("your number is = " + num1);
            num1 = randy.nextInt(100)+1;
        }
        System.out.println("your number is = " + num1);
    }
    public static void game(){
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("guess a number between 1 and 20");
        int userNum = scan.nextInt();
        int num1 = random.nextInt(20)+1;
        if(num1 == userNum){
            System.out.println("you got the number right");
        }
        else if (userNum < num1){
            System.out.println("your numer is too low"+ " you guessed " + userNum + " and the actual number was " + num1);
        }
        else{
            System.out.println("your number is too high" + " you guessed " + userNum + " and the actual number was " + num1);
        }
    }
}
