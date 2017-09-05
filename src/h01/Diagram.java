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
public class Diagram extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {


    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(50,100,50,100);
        g.fillRect(50,100,50,100);
        g.setColor(Color.green);
        g.drawRect(100,160,50,40);
        g.fillRect(100,160,50,40);
        g.setColor(Color.yellow);
        g.drawRect(150,120,50,80);
        g.fillRect(150,120,50,80);

    }


}