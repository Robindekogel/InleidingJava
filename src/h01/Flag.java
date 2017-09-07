/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Flag extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {


    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {

        g.setColor(Color.red);
        g.drawLine(50, 200, 270,200);
        g.drawLine(50,200,170,100);
        g.drawLine(170,100,270,200);


    }


}