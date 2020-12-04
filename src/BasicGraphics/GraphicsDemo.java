package BasicGraphics;

import javax.swing.*;
import java.awt.*;
public class GraphicsDemo extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        //Set Background
        this.setBackground(Color.BLACK);
        //allows to start drawing
        Graphics2D g2 = (Graphics2D) g;
//        //set drawing color
//        g2.setColor(Color.WHITE);
//        //stroke size (width)
//        g2.setStroke(new BasicStroke(4));
//        //actual drawing
//        g2.drawLine(0,0,400,400);

//        //text
//        //font                    font         style      size
//        g2.setFont(new Font("Comic sans", Font.ITALIC,25));
//        //text color
//        g2.setColor(Color.white);
//        //drawing text      text         x      y
//        g2.drawString("Inventory", 100,100);

//        //drawing polygons
//        g2.setColor(Color.white);
//        int [] x = {100,200,300};
//        int [] y = {300,127,300};
//        //draw
//        g2.drawPolygon(x,y,3);
//        //fill
//        g2.fillPolygon(x,y,3);

//        g2.setColor(Color.white);
//        g2.setStroke(new BasicStroke(4));
//        //draw
//        g2.drawRect(50,50,300,300);
//        //fill
//        g2.fillRect(60,60,280,280);
    }
}
