package Test1;

import javax.swing.*;
import java.awt.event.*;

public class Test1 {
    
    public static void main(String[] args) {
        JFrame f = new JFrame("Event");
        JButton b = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        
        b.addActionListener(e->System.out.println("clicked"));
        
        f.add(b);
        f.add(b2);
        
        f.setSize(300, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
