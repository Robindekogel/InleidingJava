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
public class Huis extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {


    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {


    g.setColor(Color.black);
    g.drawRect(100,100,100,100);
    g.drawLine(100,100,150,50);
    g.drawLine(150,50,200,100);
    g.drawRect(115,120,15,15);




    }


}