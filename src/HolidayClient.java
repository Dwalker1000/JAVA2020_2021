import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;
public class HolidayClient {
    public static void main(String [] args){
        boolean on = true;
        Scanner scan= new Scanner(System.in);
        Holiday holiday = new Holiday();
        do {
            int xyz = 1;
            if (xyz == 1) {
                menu();
                int x = scan.nextInt();
                if (x == 1) {
                    newHoliday(holiday, scan);
                }
                if (x == 2) {
                    System.out.println(holiday.GetName());
                }
                if (x == 3) {
                    ChangeName1(holiday, scan);
                }
                if (x == 4) {
                    System.out.println(holiday.GetDay());
                }
                if (x == 5){
                    changeDay(scan, holiday);
                }
                if (x == 6){
                    System.out.println(holiday.GetMonth());
                }
                if (x == 7){
                    changeMonth(scan, holiday);
                }
                if (x == 8) {
                    System.out.println(holiday.toString());
                }
                if (x == 9) {
                    System.out.println(holiday.inSameMonth(holiday));
                }
                if (x == 10) {
                    System.out.println(holiday.AvgDay());
                }
                if (x == 11) {
                    System.out.println(holiday.AvgMonth());
                }
                if (x == 12) {
                    System.out.println("thanks for using the Program");
                    on = false;
                    break;
                }
            }
        } while (on);
    }
    public static void menu(){
        System.out.println("**********************************");
        System.out.println("*              Menu              *");
        System.out.println("*                                *");
        System.out.println("* 1. Create new holiday          *");
        System.out.println("* 2. See Name                    *");
        System.out.println("* 3. Change Name                 *");
        System.out.println("* 4. See Day                     *");
        System.out.println("* 5. Change Day                  *");
        System.out.println("* 6. See Month                   *");
        System.out.println("* 7. Change Month                *");
        System.out.println("* 8. Full Holiday                *");
        System.out.println("* 9. are they in the same month  *");
        System.out.println("* 10. Average Day                *");
        System.out.println("* 11. Average Month              *");
        System.out.println("* 12. Exit                       *");
        System.out.println("**********************************");
    }
    public static void newHoliday(Holiday holiday,Scanner scan){
        System.out.println("what is your Holiday's name");
        String name = scan.next();
        holiday.ChangeName(name);
        System.out.println("what day is your Holiday on");
        int day = scan.nextInt();
        holiday.ChangeDay(day);
        System.out.println("what month is your Holiday in");
        String month = scan.next();
        holiday.ChangeMonth(month);
        Holiday holiday1 = new Holiday(name,day,month);
    }
    public static void SeeName(Holiday holiday, Scanner scan){
        holiday.GetName();
    }
    public static void ChangeName1(Holiday holiday, Scanner scan){
        System.out.println("what do you want to change the name to?");
        String x = scan.next();
        holiday.ChangeName(x);
    }
    public static void changeDay(Scanner scan, Holiday holiday){
        System.out.println("What do you want to change the name to?");
        int input = scan.nextInt();
        holiday.ChangeDay(input);
    }
    public static void changeMonth(Scanner scan, Holiday holiday){
        System.out.println("what do you want to change the month to?");
        String input = scan.next();
        holiday.ChangeMonth(input);
    }
}
