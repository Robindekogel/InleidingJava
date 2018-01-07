import java.awt.*;
import java.applet.*;

public class opdracht13_1 extends Applet {


    public void paint(Graphics g) {
        driehoek(g,100,100,150,50,200,100);
    }


    void driehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x1,y1,x3,y3);
        g.drawLine(x2,y2,x3,y3);
    }

}