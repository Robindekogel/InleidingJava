package H10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijkopdracht10 extends Applet {

    TextField tekstvlak;
    Label label;
    Button knop;
    String gm;
    int uitkomst;

    public void init() {
        tekstvlak = new TextField( 8);
        tekstvlak.addActionListener(new TekstvlakListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        label = new Label("Cijfer");
        knop  = new Button("Toon");
        knop.addActionListener(new knopListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uitkomst = Integer.parseInt(tekstvlak.getText());

                if (uitkomst > 0 && uitkomst < 4) {
                    gm = "Slecht";
                } else if (uitkomst == 4) {
                    gm = "Onvoldoende";
                } else if (uitkomst == 5){
                    gm = "Matig";
                } else if (uitkomst > 5 && uitkomst < 8) {
                    gm = "Voldoende";
                } else if (uitkomst > 7 && uitkomst < 11) {
                    gm = "Goed";
                } else if (uitkomst > 11) {
                    gm = "Geen geldige invoer";
                }
                repaint();
            }

        });
        add(label);
        add(tekstvlak);
        add(knop);
    }
    public void paint(Graphics g) {

        g.drawString("Beoordeling: " + gm ,50,50);

    }
    abstract class knopListener implements ActionListener {

    }
    public abstract class TekstvlakListener implements ActionListener {
    }
}