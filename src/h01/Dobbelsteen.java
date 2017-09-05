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
public class Dobbelsteen extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {


    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {

      g.setColor(Color.black);
      g.drawRoundRect(100,100,200,200,50,50);
      g.setColor(Color.red);
      g.fillRoundRect(100,100,200,200,50,50);
      g.setColor(Color.white);
      g.drawOval(120,120,50,50);
      g.fillOval(120,120,50,50);
      g.drawOval(230,120,50,50);
      g.fillOval(230,120,50,50);
      g.drawOval(120,230,50,50);
      g.fillOval(120,230,50,50);
      g.drawOval(230,230,50,50);
      g.fillOval(230,230,50,50);




    }


}