package testniteph;

import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.util.Random;

public class Testniteph {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        Random random = new Random();
        
        f.setSize(500, 600);
        f.setLayout(null);
        
        
        Label title = new Label("Check who you wanna do:");
        title.setBounds(150, 100, 300, 50);
        f.add(title);
        
        Checkbox c1 = new Checkbox("Luigi");
        c1.setBounds(150, 160, 300, 20);
        f.add(c1);
        
        Checkbox c2 = new Checkbox("Nyle");
        c2.setBounds(150, 180, 300, 20);
        f.add(c2);
        
        Checkbox c3 = new Checkbox("Aboy");
        c3.setBounds(150, 200, 300, 20);
        f.add(c3);
        
        Checkbox c4 = new Checkbox("Kim");
        c4.setBounds(150, 220, 300, 20);
        f.add(c4);
        
        Checkbox c5 = new Checkbox("Charlie Kirk");
        c5.setBounds(150, 240, 300, 20);
        f.add(c5);
        
        Checkbox c6 = new Checkbox("Maam Betong");
        c6.setBounds(150, 260, 300, 20);
        f.add(c6);
        
        
        JButton b1 = new JButton("Kill");
        b1.setBounds(150, 400, 50, 50);
        f.add(b1);
        b1.addActionListener(e->System.out.println("you killed..."));
        
        JButton b2 = new JButton("Save");
        b2.setBounds(210, 400, 50, 50);
        f.add(b2);
        b2.addActionListener(e->System.out.println("YOU SAVED !!! :D"));
        
        JButton b3 = new JButton("Generate random number");
        b3.setBounds(150, 450, 300, 50);
        f.add(b3);
        b3.addActionListener(e->{
            int randomInt = random.nextInt(100);
            System.out.println("Your random number: "+ randomInt);
        });
        
        f.setVisible(true);
    }
    
}
