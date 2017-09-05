


//importeer de benodigde klassen uit de Java bibliotheek

import sun.text.resources.ro.CollationData_ro;

import java.applet.Applet;
import java.awt.*;

//een klasse met de naam Show van het type Applet
public class Driehoek extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {


    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawLine(150, 150, 250, 150);
        g.drawLine(250, 150, 200, 75);
        g.drawLine(200, 75, 150, 150);
    }

}