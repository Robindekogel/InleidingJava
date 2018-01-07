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


public class Positieve extends Applet {

    int  a, b , uitkomst;


    public void init() {

        a = 938920697;
        b = 574752652;
        uitkomst = ( a * b );


    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is:  " + uitkomst,20,20);

    }

}