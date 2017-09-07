package H06;/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek

import sun.text.resources.ro.CollationData_ro;

import java.applet.Applet;
import java.awt.*;


public class Rekenen extends Applet {
    int a, b, c;
    double uitkomst;



    public void init() {

        a = 8;
        b = 8;
        c = 3;
        uitkomst = ( a + b ) / c;

    }

    public void paint(Graphics g) {

        g.drawString("De uitkomst is:" + uitkomst, 20,20);

    }

}