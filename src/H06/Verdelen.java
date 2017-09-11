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


public class Verdelen extends Applet {
    double a, b,  uitkomst;



    public void init() {

        a = 113;
        b = 4;
        uitkomst = ( a / b );

    }

    public void paint(Graphics g) {

        g.drawString("Jan krijgt: ", 20,20);
        g.drawString( "" + uitkomst, 150,20);
        g.drawString("Ali krijgt: " , 20,40);
        g.drawString( "" + uitkomst, 150,40);
        g.drawString("Jeanette krijgt: " , 20,60);
        g.drawString( "" + uitkomst, 150,60);
        g.drawString("Robin krijgt: ",20,80);
        g.drawString( "" + uitkomst, 150,80);
    }

}