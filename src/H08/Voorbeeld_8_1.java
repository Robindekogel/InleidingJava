

import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class Voorbeeld_8_1 extends Applet {
        Button knop;
        String schermtekst;



    public void init() {
    schermtekst = "Doet deze knop wel iets?";
    knop = new Button("Klik op mij");
    KnopListener kl = new KnopListener();
    knop.addActionListener((kl));
    add(knop);

    }

    public void paint(Graphics g) {
            g.drawString(schermtekst, 50,50);
    }

    class KnopListener implements ActionListener {
        public void  actionPerformed ( ActionEvent e){
          schermtekst = "";
          repaint();
        }

    }
}

