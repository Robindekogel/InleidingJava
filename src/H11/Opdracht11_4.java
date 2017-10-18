package H11;
        import java.awt.*;
        import java.applet.*;
public class Opdracht11_4 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int tafel = 3;
        int y = 0;

        for (teller = 0; teller <= 10; teller++){

            g.drawString("" + teller + " x " + tafel + " = " + (teller * tafel),60,y);
            y += 25;

        }
    }
}
