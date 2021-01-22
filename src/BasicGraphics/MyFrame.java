package BasicGraphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    GraphicsDemo graphics = new GraphicsDemo();
    public MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        //basic screen
//        this.setSize(500,600);
//        this.add(graphics);
        //submit text button
        button = new JButton("Submit");
        button.addActionListener(this);
        //changes if button can be used
        button.setEnabled(true);
        this.add(button);

        //text field
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        //size and font
        textField.setFont(new Font("Comic sans", Font.PLAIN, 25));
        //text color
        textField.setForeground(Color.yellow);
        //background color
        textField.setBackground(Color.BLACK);
        //carrot Randome.line at end of input text
        textField.setCaretColor(Color.yellow);
        //text already in the box
        textField.setText("username");
        //changes if you can edit the text
        textField.setEditable(true);
        this.add(textField);

        //fit screen fits components on screen
        this.setLayout(new FlowLayout());
        this.pack();


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button){
            System.out.println(textField.getText());
        }
    }
}