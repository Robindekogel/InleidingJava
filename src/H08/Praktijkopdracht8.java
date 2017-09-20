package H08;



import java.awt.*;
        import java.applet.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Praktijkopdracht8 extends Applet {
            TextField tekstvlak;
            TextField tekstvlak2;
            Button knop;
            Button knop2;
            Button knop3;
            Button knop4;
            String s;
            String d;
            double getal;
            double getal2;
            double uitkomst;



    public void init() {
        tekstvlak = new TextField("",25);
        tekstvlak2 = new TextField("",25);
        knop = new Button ("*");
        knop2 = new Button("/");
        knop3 = new Button("+");
        knop4 = new Button("-");
        s = "" ;
        d = "" ;
        tekstvlak.addActionListener( new tekstvlakListener());
        tekstvlak2.addActionListener( new tekstvlak2Listener());
        KnopListener kl = new KnopListener ();
        Knop2Listener rl = new Knop2Listener();
        Knop3Listener bl = new Knop3Listener();
        Knop4Listener vl = new Knop4Listener();
        knop.addActionListener(( kl ));
        knop2.addActionListener(( rl ));
        knop3.addActionListener((bl));
        knop4.addActionListener((vl));
        add(tekstvlak);
        add(tekstvlak2);
        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);



    }

    public void paint (Graphics g) {
        this.setSize(550,250);


        ;
    }


    private class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvlak.getText();
            d = tekstvlak2.getText();
            getal = Double.parseDouble( s );
            getal2 = Double.parseDouble( d );
            uitkomst = getal * getal2;
            tekstvlak.setText(String.valueOf(uitkomst));

        }
    }

    private class Knop2Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        s = tekstvlak.getText();
        d = tekstvlak2.getText();
        getal = Double.parseDouble( s );
        getal2 = Double.parseDouble( d );
        uitkomst = getal / getal2;
        tekstvlak.setText(String.valueOf( uitkomst));

        }
    }

    private class Knop3Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvlak.getText();
            d = tekstvlak2.getText();
            getal = Double.parseDouble( s );
            getal2 = Double.parseDouble( d);
            uitkomst = getal + getal2;
            tekstvlak.setText(String.valueOf( uitkomst));

        }
    }

    private class Knop4Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        s = tekstvlak.getText();
        d = tekstvlak2.getText();
        getal = Double.parseDouble( s );
        getal2 = Double.parseDouble( d );
        uitkomst = getal - getal2;
        tekstvlak.setText(String.valueOf(uitkomst));
        }
    }


     class tekstvlakListener implements ActionListener {
         @Override
         public void actionPerformed(ActionEvent e) {


         }
     }

    class tekstvlak2Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}








