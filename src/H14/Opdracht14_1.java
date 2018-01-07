package H14;

import java.awt.*;
import java.applet.*;

public class Opdracht14_1 extends Applet {
    String kaart = "";

    public void init() {
        String[] figuur = { "Klaver", "Schoppen", "Harten", "Ruiten" };
        String[] kaartnummer = {"één", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "koning", "aas"};

        double r;
        int i;

        r = Math.random();
        i = (int)(r * 3 + 1);
        kaart = figuur[i];

        r = Math.random();
        i = (int)(r * 13 + 1);
        kaart = kaart + " " + kaartnummer[i];
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Je kaart is: " + kaart,50,50);
    }
}