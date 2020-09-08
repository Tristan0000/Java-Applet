
import java.awt.*;
import java.applet.*;


public class welcometojava extends Applet {


    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Tristan", 50, 60 );
        g.setColor(Color.red);
        g.drawString("van Caspel", 50, 80 );
    }

}