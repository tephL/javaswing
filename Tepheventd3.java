package tepheventd3;

import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;

public class Tepheventd3 {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JButton b = new JButton("Touch me");
        JLabel jl = new JLabel("Hello !! :D");
        
        //x y wid h
        
        ImageIcon icon = new ImageIcon("my_image.png");
        Image resizedImage = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        icon = new ImageIcon(resizedImage);
        
        b.setBounds(50, 50, 120, 80);
        jl.setBounds(50, 150, 200, 40);
        
        b.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e){}
            @Override
            public void mousePressed(MouseEvent e){
                jl.setText("IM GETTING TOUCHED");
            }
            @Override
            public void mouseReleased(MouseEvent e){
                jl.setText("PLESSE TOUCH MOREE");
            }
            @Override
            public void mouseEntered(MouseEvent e){
                jl.setText("ITS CLOSEEEE");
            }
            @Override
            public void mouseExited(MouseEvent e){
                jl.setText("jus a kirky bit. touch meeeee");
            }
        });
        
        jf.setSize(300, 400);
        jf.add(b);
        jf.add(jl);
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);
    }
    
}
