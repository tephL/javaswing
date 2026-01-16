package trepheventd2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Trepheventd2{
    public static void main(String[] args){
        JFrame f = new JFrame("Multiple");
        JTextField tf = new JTextField();
        JLabel jl = new JLabel("Hover or Type");
       
        f.setSize(400,300);
        
        tf.setBounds(50, 50, 200, 30);
        jl.setBounds(50, 100, 200, 30);
        
        jl.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e){}
            @Override
            public void mousePressed(MouseEvent e){
                jl.setText("mouse clicked");
            }
            @Override
            public void mouseReleased(MouseEvent e){
                jl.setText("mouse released");
            }
            @Override
            public void mouseEntered(MouseEvent e){
                jl.setText("mouse entered");
            }
            @Override
            public void mouseExited(MouseEvent e){
                jl.setText("mouse exited");
            }
        });
        
        tf.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e){
                System.out.println("key typed: " + e.getKeyChar() + "\n");
            }
            @Override
            public void keyPressed(KeyEvent e){
                System.out.println("key pressed: " + e.getKeyChar() + "\n");
            }
            @Override
            public void keyReleased(KeyEvent e){
                System.out.println("key released: " + e.getKeyChar() + "\n");
            }
        });
        
        
        f.add(tf);
        f.add(jl);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        System.out.println("hello");
        
        
    }
}
