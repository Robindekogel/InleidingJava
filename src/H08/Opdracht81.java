import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht81 extends Applet {
    TextField tekstvlak;
    Button knop;
    Button knop2;
    Label label;
    String s;
    String d;

    public void init() {
        tekstvlak = new TextField(" ",20);
        label = new Label("Type hier uw bericht " + "");
        tekstvlak.addActionListener( new tekstvlakListener() );
        knop = new Button("Reset");
        knop2 = new Button("oke");
        KnopListener kl = new KnopListener();
        Knop2Listener rl = new Knop2Listener();
        knop.addActionListener((kl));
        knop2.addActionListener(rl);
        add(knop);
        add(knop2);
        add (label);
        add ( tekstvlak );
        s = "";
        d = "";
    }

    public void paint (Graphics g) {
        g.drawString(s, 50,50);

    }

    class  tekstvlakListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            s = tekstvlak.getText();
            repaint();
        }
    }

    private class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = d ;
            repaint();
        }
    }


    private class Knop2Listener implements  ActionListener{
        public  void  actionPerformed(ActionEvent e) {
            s = tekstvlak.getText();
            repaint();
        }
    }
}
