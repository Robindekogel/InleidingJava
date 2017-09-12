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


public class Praktijkopdracht6 extends Applet {
    double uitkomst;
    int uitkomstb;



    public void init() {

        uitkomst =  (( 5.9 + 6.3 + 6.9 ) / 3  ) *10;
        uitkomstb = (int)(( uitkomst  ));
        uitkomst = (double) uitkomstb /10;



    }

    public void paint(Graphics g) {

        g.drawString("Gemiddelde is: " + uitkomst, 20, 20);


    }

}