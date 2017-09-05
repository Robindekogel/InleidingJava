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
public class Naam2 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {


    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {

        setBackground(Color.white);
        g.setColor(Color.blue);
        g.drawString("Robin",100,100);
        g.setColor(Color.red);
        g.drawString("De kogel",100,110);

    }


}