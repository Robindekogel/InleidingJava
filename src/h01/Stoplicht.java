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
public class Stoplicht extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {


    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {

        g.drawRect(100,100,80,150);
        g.fillRect(100,100,80,150);
        g.drawLine(140,100,140,400);
        g.setColor(Color.red);
        g.drawRoundRect(125,115,35,35,35,35);
        g.fillRoundRect(125,115,35,35,35,35);
        g.setColor(Color.orange);
        g.drawRoundRect(125,155,35,35,35,35);
        g.fillRoundRect(125,155,35,35,35,35);
        g.setColor(Color.green);
        g.drawRoundRect(125,195,35,35,35,35);
        g.fillRoundRect(125,195,35,35,35,35);




    }


}