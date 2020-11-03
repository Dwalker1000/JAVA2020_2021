import java.util.*;
public class TempAverageAppMenu {
    public static int [] temps = new int [30];
    public static int sum = 0;
    public static double average;
    public static void main(String [] args) {
        menu();
    }
    public static void menu() {
        String rep = "yes";
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("***********************************");
            System.out.println("*               menu              *");
            System.out.println("*                                 *");
            System.out.println("* 1. Input 30 days temp           *");
            System.out.println("* 2. calculate average            *");
            System.out.println("* 3. how many days below average  *");
            System.out.println("* 4. how many days below average  *");
            System.out.println("* 5. input new temp               *");
            System.out.println("* 6. exit                         *");
            System.out.println("***********************************");
            int answer = scan.nextInt();
            switch (answer) {
                case 1:
                    first();
                    System.out.println("your string is " + Arrays.toString(temps));
                    break;
                case 2:
                    average();
                    break;
                case 3:
                    below();
                    break;
                case 4:
                    above();
                    break;
                case 5:
                case 6:
                    rep = "no";
                default:

            }
        } while (rep == "yes");
    }
    public static void first(){
        Scanner scan = new Scanner(System.in);
        for (int x = 0; x <= temps.length-1; x++) {
            System.out.println("What do you want the " + x + " day to be");
            int input = scan.nextInt();
            temps [x] += input;
            sum += temps[x];
        }
    }
    public static void average(){
        average = sum/temps.length;
        System.out.println("the average temp is " + average);
        System.out.println();
    }
    public static void below(){
        int counter2 = 0;
        for (int i=0;i < temps.length;i++) {
            if (temps[i] < average) {
                counter2++;
            }
            System.out.println("there are " + counter2 + " days above the average temp");
        }
    }
    public static void above(){
        int counter = 0;
        for (int i=0;i < temps.length;i++) {
            if (temps[i] > average) {
                counter++;
            }
        }
        System.out.println("there are " + counter + " days above the average temp");
    }
    public static void newTemp(){
        Scanner scan = new Scanner(System.in);
        System.out.println("what do you want the temp on day 30 to be (the closer to the average the more accurate it will be)");
        int [] temp = new int [temps.length];
        int usertemp = scan.nextInt();
        for (int i = 0; i< temps.length-1; i++) {
            temp[i] = temps[i + 1];
        }
        temp [temp.length-1] += usertemp;
        System.out.println(temp.length);
        sum += usertemp;
    }
    public static void refrence(){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("what type of units do you want to use (fahrenheit or celsius)");
        String type = scan.nextLine();
        System.out.println("what do you want the lowest temp to be");
        int low = scan.nextInt();
        System.out.println("what do you want the highest temp to be (must be higher than the lowest temp)");
        int high = scan.nextInt();
        int sum = 0;
        int [] temps = new int [30];
        //adds to first array
        for (int x = 0; x <temps.length-1; x++){
            int result = random.nextInt(high-low) + low;
            temps [x]+= result;
            sum += temps[x];
        }
        sum -= temps[0];
        //gets user temp
        System.out.println("what do you want the temp on day 30 to be (the closer to the average the more accurate it will be)");
        int usertemp = scan.nextInt();

        //adds user temp to the last poss
        System.out.println(" ");
        int [] temp = new int [temps.length];
        for (int i = 0; i< temps.length-1; i++) {
            temp[i] = temps[i + 1];
        }
        temp [temp.length-1] += usertemp;
        System.out.println(temp.length);
        sum += usertemp;

        //prints arrays
        System.out.println(Arrays.toString(temp));
        System.out.println();

        //finds average
        double average = sum/temps.length;
        System.out.println("the average temp is " + average);
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

        //finds amount of days below the average
        for (int i=0;i < temps.length;i++) {
            if (temps[i] < average) {
                counter2++;
            }
        }
        System.out.println("there are "+counter2+" days below the average temp");
    }
}

