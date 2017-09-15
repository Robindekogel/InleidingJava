package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Opdracht81 extends Applet {
    TextField txtinput;
    Button oke;
    Button opnieuw;


    public void init() {
        txtinput = new TextField("",50);
        label = new label ("Laat hier uw bericht achter");
        oke = new Button("oke");
        opnieuw = new Button("Reset");
        add ( oke );
        add( opnieuw );


    }

    public void paint(Graphics g) {
    g.drawString("Vul hier uw gegvens in ",70,70);

    }


    class opnieuwListener implements ActionListener {
        public void actionPerformed ( ActionEvent e) {
            txtinput.setText("");
            repaint();
        }

    }
}


