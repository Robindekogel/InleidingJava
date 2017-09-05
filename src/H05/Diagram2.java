package H05;/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek

import sun.text.resources.ro.CollationData_ro;

import java.applet.Applet;
import java.awt.*;


public class Diagram2 extends Applet {

    int jeroen;
    int valerie;
    int hans;



    public void init() {

        jeroen = 100;
        valerie = 40;
        hans = 80;

    }


    public void paint(Graphics g) {
        g.drawString("Jeroen",5,115);
        g.setColor(Color.red);
        g.fillRect(50,100,jeroen,30);
        g.setColor(Color.black);
        g.drawString("Valerie",5,145);
        g.setColor(Color.green);
        g.fillRect(50,130,valerie,30);
        g.setColor(Color.black);
        g.drawString("Hans",5,175);
        g.setColor(Color.yellow);
        g.fillRect(50,160,hans,30);

    }


}