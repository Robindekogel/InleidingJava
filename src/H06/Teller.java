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


public class Teller  extends Applet {

    int teller;



    public void init() {

      teller = 0;
    }


    public void paint(Graphics g) {

                teller++;
                g.drawString("Scherm is " + teller +
                " keer ververst.", 50,60);

    }

}