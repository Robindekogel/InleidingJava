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


public class Seconden extends Applet {

    int uur, dag, jaar;

    public void init() {
    uur = 60*60;
    dag = 24*uur;
    jaar = 365*dag;



    }

    public void paint(Graphics g) {
    g.drawString("uur: ",20,20);
    g.drawString(""+ uur, 150,20);
    g.drawString("dag: ", 20,40);
    g.drawString(""+ dag, 150,40);
    g.drawString("jaar: ",20,60);
    g.drawString(""+ jaar,150,60);


    }

}