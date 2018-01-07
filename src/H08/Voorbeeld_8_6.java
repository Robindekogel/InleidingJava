import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Voorbeeld_8_6 extends Applet {

    TextField tekstvlak;
    Button knop;


    public void init() {
        tekstvlak = new TextField("", 50);
        knop = new Button("oke");
        knop.addActionListener(new KnopListener());
        add(tekstvlak);
        add(knop);




    }

    public void paint(Graphics g) {
        g.drawString("Typ een hele lange tekst hier " + "in het vakje" +
                " en klik op oke", 50, 50);

    }

    class KnopListener implements ActionListener  {
        public void actionPerformed(ActionEvent e) {
            tekstvlak.setText("" +
                    "");
            repaint();
        }

    }
}



