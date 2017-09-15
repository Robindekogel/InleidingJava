import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht82 extends Applet {
    TextField tekstvlak;
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    String s;
    int a;
    int b;
    int c;
    int d;




    public void init() {
        tekstvlak = new TextField("",50);
        knop = new Button("Man");
        knop2 = new Button("Vrouw");
        knop3 = new Button("Potentiële Man");
        knop4 = new Button("Potentiële Vrouw");
        tekstvlak.addActionListener( new tekstvlakListener());
        knopListener al = new knopListener ();
        knop2Listener bl = new knop2Listener ();
        knop3Listener cl = new knop3Listener ();
        knop4Listener dl = new knop4Listener ();
        knop.addActionListener(al);
        knop2.addActionListener(bl);
        knop3.addActionListener(cl);
        knop4.addActionListener(dl);
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        s = "";
        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);

    }

    public void paint (Graphics g) {
    g.drawString(String.valueOf(a),60,60);
    g.drawString(String.valueOf(b), 110,60);
    g.drawString(String.valueOf(c),180,60);
    g.drawString(String .valueOf(d),280,60);

    }



    class  tekstvlakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        s = tekstvlak.getText();

        }
    }


     class knopListener implements ActionListener {
         @Override
         public void actionPerformed(ActionEvent e) {
             a = a + 1;
             repaint();


         }
     }


    class knop2Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            b = b + 1;
            repaint();

        }
    }

    private class knop3Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            c = c + 1;
            repaint();
        }
    }

    private  class knop4Listener implements ActionListener {
        public void  actionPerformed(ActionEvent e) {
            d = d + 1;
            repaint();

        }



    }
}
