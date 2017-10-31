package H11;
import java.awt.*;
import java.applet.*;
public class Opdracht11_8 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        this.setSize(new Dimension(150,150));
        int teller;
        int y = 80;
        int x = 80;
        int w = 20;
        int h = 20;
        for ( teller = 0; teller <=4; teller++){
            y -= 5;
            x -= 5;
            w += 10;
            h += 10;
            g.drawOval(x,y,w,h);
        }
    }
}
