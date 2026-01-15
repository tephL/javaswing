package Test1;

import javax.swing.*;
import java.awt.event.*;

public class Test1 {
    
    public static void main(String[] args) {
        JFrame f = new JFrame("Event");
        JButton b = new JButton("Button 1");  //make a button
        JButton b2 = new JButton("Button 2");  //make 2nd button
        
        b.addActionListener(e->System.out.println("clicked"));
        //if button b is clicked, this will be printed out
        
        //add the buttons within the frame
        f.add(b); 
        f.add(b2);
        
        //declare frame (window) size
        f.setSize(300, 350);

        // exiter
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //shows the frame as a window
        f.setVisible(true);
        
    }
    
}
