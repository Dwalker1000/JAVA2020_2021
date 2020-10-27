import java.util.*;
public class WeatherQuestion {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("how many days does the program run for");
        int days = scan.nextInt();
        int [] temp = new int[days];
        int sum = 0;
        for (int i = 0; i< temp.length; i++){
            int x = i+1;
            System.out.println("whats the temp on day "+ x);
            temp [i]= scan.nextInt();
            sum += temp[i];
        }
        for (int i = 0; i< days; i++){
            int x = i+1;
            System.out.println("the high for day " + x + " was " + temp[i]);
        }
        System.out.println();
        double avrage = (double)sum/temp.length;
        int counter = 0;
        for (int i=0;i < temp.length;i++){
            if (temp[i]>avrage){
                counter++;
            }
        }
        System.out.printf("Average temp %.2f\n", avrage);
        System.out.println("their are " +counter+ " days above the average temp");
    }
}
