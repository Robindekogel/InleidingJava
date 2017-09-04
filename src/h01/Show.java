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
public class Show extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {


    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {


    g.setColor(Color.red);
    g.fillRect(50,100,100,30);
    g.setColor(Color.white);
    g.fillRect(50,130,100,30);
    g.setColor(Color.blue);
    g.fillRect(50,160,100,30);
    g.setColor(Color.black );
    g.drawRect(50,100,100,90);
    g.drawLine(50,100,50,300);
    g.setColor(Color.orange);
    g.fillRoundRect(45,90,10,10,10,10);
    g.drawRoundRect(45,90,10,10,10,10);




    }


}