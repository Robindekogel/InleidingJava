package H11;
import java.awt.*;
import java.applet.*;
public class Opdracht11_6 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        this.setSize(new Dimension(650,650));
        int teller;
        int y = 300;
        int x = 300;
        int w = 20;
        int h = 20;
        for ( teller = 0; teller <=50; teller++){
            y -= 4;
            x -= 4;
            w += 8;
            h += 8;
            g.drawOval(x,y,w,h);
        }
    }
}
