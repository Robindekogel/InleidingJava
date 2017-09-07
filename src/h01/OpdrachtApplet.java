package h01;/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek

import sun.text.resources.ro.CollationData_ro;

import java.applet.Applet;
import java.awt.*;

//een klasse met de naam Show van het type Applet
public class OpdrachtApplet extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {


    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {

        g.drawLine(20, 20, 170, 20);
        g.drawString("Lijn", 85, 35);
        g.drawRect(20, 50, 150, 50);
        g.drawString("Rechthoek", 70, 115);
        g.drawRoundRect(20, 125, 150, 50, 20, 20);
        g.drawString("Afgeronde Rechthoek", 40, 190);
        g.setColor(Color.magenta);
        g.fillRect(180, 50, 150, 50);
        g.setColor(Color.black);
        g.drawOval(180, 50, 150, 50);
        g.drawString("Gevulde rechthoek met ovaal", 170, 115);
        g.drawOval(180, 125, 150, 50);
        g.setColor(Color.magenta);
        g.fillOval(180, 125, 150, 50);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 215, 190);
        g.drawArc(345, 50, 150, 50, 360, 360);
        g.setColor(Color.magenta);
        g.fillArc(345, 50, 150, 50, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 345, 115);
        g.drawArc(375, 125, 75, 75, 90, 360);
        g.drawString("Cirkel", 400, 220);

    }


}