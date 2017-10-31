package H11;
import java.awt.*;
import java.applet.*;
public class Opdracht11_7 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        this.setSize(new Dimension(950,950));
        int teller;
        int y = 450;
        int x = 450;
        int w = 20;
        int h = 20;
        for ( teller = 0; teller <=100; teller++){
            y -= 4;
            x -= 4;
            w += 8;
            h += 8;
            g.drawOval(x,y,w,h);
        }
    }
}
