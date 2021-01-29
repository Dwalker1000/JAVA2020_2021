import java.awt.*;
import java.awt.event.InputEvent;
import java.util.*;

public class autoClicker {
    static long speed = 10;
    static int stopKey = 1;
    public static void main (String [] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Scanner scan = new Scanner(System.in);
        int x = 1;
        System.out.println("interval between clicks (in milliseconds)");
        speed = scan.nextLong();
        System.out.println("press the stop key");
        System.out.println("press the key you want to click");
        while (x == 1) {
//            if ();
            robot.mousePress(InputEvent.BUTTON1_MASK);
            Thread.sleep(speed);


        }
    }
}