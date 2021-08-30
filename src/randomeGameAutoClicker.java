import java.awt.*;
import java.awt.event.InputEvent;

public class randomeGameAutoClicker {
    public static void main (String [] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        int x = 0;
        robot.delay(5000);
        while (x == 0){
//            robot.delay(10);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.delay(1000);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
        }
    }
}
