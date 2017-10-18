package H11;


import java.awt.*;
import java.applet.*;


public class Opdracht11_1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for (teller = 0; teller < 10; teller++) {
            x += 20;
            g.drawLine(x, 25, x, 300);

        }
    }

}