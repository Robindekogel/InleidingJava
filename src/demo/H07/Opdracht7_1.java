package H07;/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek

import sun.text.resources.ro.CollationData_ro;

import java.applet.Applet;
import java.awt.*;


public class Opdracht7_1 extends Applet {



    public void init() {
        this.setSize(1200,900);



    }

    public void paint(Graphics g) {

    g.drawString("Applet screen size aangepast");
    }

}