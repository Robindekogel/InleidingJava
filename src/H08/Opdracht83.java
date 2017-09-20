import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht83 extends Applet {
    TextField tekstvlak;
    Label label;
    Button knop;
    Button knop2;
    String s;
    String d;
    double getal;



    public void init() {
        tekstvlak = new TextField("",50);
        knop = new Button("oke");
        knop2 = new Button("Reset");
        label = new Label("Inclusief BTW");
        tekstvlak.addActionListener( new tekstvlaklistener());
        KnopListener kl = new KnopListener ();
        Knop2Listener rl = new Knop2Listener();
        knop.addActionListener((kl));
        knop2.addActionListener((rl));
        add(tekstvlak);
        add(knop);
        add(knop2);
        s = "";
        d = "";


    }

    public void paint (Graphics g) {
    g.drawString("" + getal ,50,50);


    }


    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvlak.getText();
            getal = Double.parseDouble( s );
            getal *= 1.21;
            repaint();


    }

}


    private class tekstvlaklistener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            s = tekstvlak.getText();
            getal = Double.parseDouble( s );
            getal *= 1.21;
            repaint();
        }
    }

    class Knop2Listener implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            getal = 0;
            repaint();

        }
    }
}



