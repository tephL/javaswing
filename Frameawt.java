package frameawt;

import java.awt.*;

public class Frameawt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame f = new Frame("AWT Component Example");
        
        /*
        Panel p = new Panel();
        Button b = new Button("Click Me");
        Label l = new Label("Enter your name");
        TextField tf = new TextField(20);
        
        Button b1 = new Button("Click Me");
        Label l1 = new Label("Enter your Planet");
        TextField tf1 = new TextField(20);
        
        Button b2 = new Button("Click Me");
        Label l2 = new Label("Enter your Dog");
        TextField tf2 = new TextField(20);
        
        Button b3 = new Button("Click Me");
        Label l3 = new Label("Enter your age");
        TextField tf3 = new TextField(20);
        
        f.add(l);
        f.add(tf);
        f.add(b);
        
        f.add(l1);
        f.add(tf1);
        f.add(b1);
        
        f.add(l2);
        f.add(tf2);
        f.add(b2);
        
        f.add(l3);
        f.add(tf3);
        f.add(b3);
        */
        
        /*
        f.setLayout(new BorderLayout());
        f.add(new Button("N"), BorderLayout.NORTH);
        f.add(new Button("S"), BorderLayout.SOUTH);
        f.add(new Button("C"), BorderLayout.CENTER);
        f.add(new Button("W"), BorderLayout.WEST);
        f.add(new Button("E"), BorderLayout.EAST);
        */
        
        f.setLayout(new GridLayout(2, 2));
        f.add(new Button("S"));
        f.add(new Button("C"));
        f.add(new Button("W"));
        f.add(new Button("E"));
        
        
        
        
        f.setSize(400, 200);
        //f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    
}
