

package H11;

        import java.awt.*;
        import java.applet.*;


public class Opdracht11_3 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int a = 1;
        int b;
        int p = 0;
        int y = 0;

        for(teller = 0; teller < 20 ; teller++) {
            y += 25;
            b = p + a;
            p = a;
            a = b;

            g.drawString("" + b, 25, y );
        }
    }
}
