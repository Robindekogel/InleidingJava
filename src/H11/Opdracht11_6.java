package H11;
import java.awt.*;
import java.applet.*;
public class Opdracht11_6 extends Applet {
    
    public void init() {
    }
    public void paint(Graphics g) {
        int teller;
        int y = 80;
        int x = 80;
        int w = 20;
        int h = 20;
        for ( teller = 0; teller <=4; teller++){
            y -= 10;
            x -= 10;
            w += 20;
            h += 20;
            g.drawOval(x,y,w,h);
        }
    }
}
