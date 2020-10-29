import java.util.*;
public class TempAverageApp {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("what type of units do you want to use (fahrenheit or celsius)");
        String type = scan.nextLine();
        System.out.println("what do you want the lowest temp to be");
        int low = scan.nextInt();
        System.out.println("what do you want the highest temp to be (must be higher than the lowest temp)");
        int high = scan.nextInt();;
        int sum = 0;
        int [] temps = new int [30];
        for (int x = 0; x <temps.length-2; x++){
            int result = random.nextInt(high-low) + low;
            temps [x]+= result;
            sum += temps[x];
        }
        System.out.println("what do you want the temp on day 30 to be (most accurate if its in between the lowest and highest)");
        int usertemp = scan.nextInt();
        temps [temps.length-1]+= usertemp;
        System.out.println(Arrays.toString(temps));
        System.out.println();
        //finds average
        double average = sum/temps.length;
        System.out.println("the average temp is " + average + " " +type);
        System.out.println();
        int counter = 0;
        int counter2 = 0;
        //finds amount of days above the average temp
        for (int i=0;i < temps.length;i++) {
            if (temps[i] > average) {
                counter++;
            }
        }
        System.out.println("there are "+counter+" days above the average temp");

        //finds amount of days below the avrage
        for (int i=0;i < temps.length;i++) {
            if (temps[i] < average) {
                counter2++;
            }
        }
        System.out.println("there are "+counter2+" days below the average temp");
    }
}
