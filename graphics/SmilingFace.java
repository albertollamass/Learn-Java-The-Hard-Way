import java.awt.*; //Para dibujar figuras, graphics
import javax.swing.JFrame; //Para window

public class SmilingFace extends Canvas{
    public void paint (Graphics g){
        
        //Head
        g.setColor(Color.yellow);
        g.drawOval(300,200,300,300);
        g.fillOval(300,200,300,300);

        //Eyes
        g.setColor(Color.blue);
        g.drawOval(375,250,50,50);
        g.fillOval(375,250,50,50);

        g.drawOval(475,250,50,50);
        g.fillOval(475,250,50,50);

        //mouth
        g.setColor(Color.red);
        g.drawArc(400,350,100,100,180,180); // from 90 degrees to 270 (90+180)


        // labels
        g.setColor(Color.black);
        g.setFont(new Font(null));
        for ( int X=0; X<800; X += 50 )
            g.drawString( String.valueOf(X), X, 50 );
        for ( int Y=100; Y<600; Y += 50 )
            g.drawString( String.valueOf(Y), 28, Y );
        // lines
        g.setColor(Color.lightGray);
        for ( int X=0; X<800; X += 50 )
            g.drawLine(X,0,X,599);    // horizontal
        for ( int Y=0; Y<600; Y += 50 )
            g.drawLine(0,Y,799,Y);    // vertical

    }

    public static void main(String[] args){
        JFrame win = new JFrame("Drawing a smiling face");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SmilingFace canvas = new SmilingFace();
        win.add( canvas );
        win.setVisible(true);
    }
}