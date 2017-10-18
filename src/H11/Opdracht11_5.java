package H11;
import java.awt.*;
import java.applet.*;
public class Opdracht11_5 extends Applet {


    public void init() {
    }
    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int x = 0;
        for ( teller = 0; teller <=4; teller++){
            y += 20;
            x += 20;
            g.drawRect(x,x,20,20);
        }
    }
}
