

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JavaChallenge2 extends Applet {

        TextField tekstvlak;
        Button knop;
        String tekst;
        String s;
        int t;
        int tijdzone1;
        int tijdzone2;
        int tijdzone3 ;
        int tijdzone4;

    public void init() {
        tekstvlak = new TextField(5);
        tekstvlak.addActionListener(new TekstvlakListener());
        tekst = "";
        knop = new Button("Toon tijden");
        knop.addActionListener(new knopListener() {
            public void actionPerformed(ActionEvent e) {
                t = Integer.parseInt(tekstvlak.getText());
                tijdzone1 = t - 5;
                tijdzone2 = t + 8;
                tijdzone3 = t - 1;
                tijdzone4 = t + 10;
                if (tijdzone1 > 24) {
                    tijdzone1 = -24;
                }
                if (tijdzone2 > 24) {
                    tijdzone2 = -24;
                }
                if (tijdzone3 > 24) {
                    tijdzone3 = -24;
                }
                if (tijdzone4 > 24) {
                    tijdzone4 = -24;
                }
                repaint();
            }
        });
        this.setSize(new Dimension(400,650));
        add(new Label("Voer een uur in"));
        add(tekstvlak);
        add(knop);
    }
    public void paint(Graphics g) {
        g.drawString(String.valueOf("Tijd in New York" + tijdzone1 + ":00 uur"),50,110);
        g.drawString(String.valueOf("Tijd in Tokyo" + tijdzone2 + ":00 uur"),50,130);
        g.drawString(String.valueOf("Tijd in London" + tijdzone3 + ":00 uur"),50,150);
        g.drawString(String.valueOf("Tijd in Sydney" + tijdzone4 + ":00 uur"),50,170);

    }
    abstract class knopListener implements ActionListener {



    }
    private class TekstvlakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {




            }
        }
    }
