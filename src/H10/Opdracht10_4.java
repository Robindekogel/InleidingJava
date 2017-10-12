package H10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Opdracht10_4 extends Applet {
    TextField tekstvak;
    TextField jaarvak;
    Label label;
    Label label2;
    String s, tekst;
    String j, jaartext;
    int jaartal;
    int dag;


    public void init() {
        tekstvak = new TextField("", 20);
        jaarvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        label2 = new Label("Type een jaartal en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        jaarvak.addActionListener(new jaarvakListener());
        tekst = "";
        jaartext = "";
        add(label);
        add(label2);
        add(tekstvak);
        add(jaarvak);
        this.setSize(new Dimension(500,250));
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 80);
        g.drawString(jaartext, 50, 120);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt(s);
            switch (dag) {
                case 1:
                    tekst = "Januari" + " 31 dagen";
                    break;
                case 2:
                    tekst = "Februari" + " 28 dagen";
                    break;
                case 3:
                    tekst = "Maart" + " 31 dagen";
                    break;
                case 4:
                    tekst = "April" + " 30 dagen";
                    break;
                case 5:
                    tekst = "Mei" + " 31 dagen";
                    break;
                case 6:
                    tekst = "Juni" + " 30 dagen";
                    break;
                case 7:
                    tekst = "Juli" + " 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus" + " 31 dagen";
                    break;
                case 9:
                    tekst = "September" + " 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober" + " 31 dagen";
                    break;
                case 11:
                    tekst = "November" + " 30 dagen";
                    break;
                case 12:
                    tekst = "December" + " 31 dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }

    public class jaarvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            j = jaarvak.getText();
            jaartal = Integer.parseInt(j);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                jaartext = "" + jaartal + " is een schrikkeljaar";
            } else {
                jaartext = "" + jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }

}

