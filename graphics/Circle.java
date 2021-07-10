import java.awt.*;
import javax.swing.JFrame;

public class Circle extends Canvas{

    public void paint (Graphics g) {

        g.setColor(Color.green);
        //x,y, tamaño radios
        g.drawOval(160,20,100,100); // draw a filled-in oval
        g.fillOval(160,20,100,100);
    }

    public static void main(String args[]){
        JFrame win = new JFrame("Drawing a green circle");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Circle canvas = new Circle();
        win.add( canvas );
        win.setVisible(true);
        
    }
}