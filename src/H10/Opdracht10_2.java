package H10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_2 extends Applet {
    TextField tekstvak;
    Label label;
    String tekst;
    int h = 0;
    int l =0;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";
        label = new Label("Vul hier een getal in" );
        add( label );
        add( tekstvak );
    }

    public void paint(Graphics g) {

        g.drawString("" + l, 50, 45 );
        g.drawString("" + h,50,65);
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {

            if (l == 0) {
                l = Integer.parseInt(tekstvak.getText());

            } else if      (l > Integer.parseInt( tekstvak.getText())) {
                l = Integer.parseInt(tekstvak.getText());
            } else if
                     (h < Integer.parseInt( tekstvak.getText())) {
                h = Integer.parseInt( tekstvak.getText());
            }

            repaint();
        }
    }

}