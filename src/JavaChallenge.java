

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JavaChallenge extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    TextField tekstvak3;
    Button knop;
    int jeroen = 0;
    int valerie = 0;
    int hans = 0;
    int standaard = 200;
    int standaard2 = 200;
    int standaard4 = 200;






    public void init() {
        tekstvak = new TextField("",5);
        tekstvak2 = new TextField("",5);
        tekstvak3 = new TextField("",5);
        knop = new Button("Toon");
        knopListener kl = new knopListener();
        knop.addActionListener(kl);
        this.setSize(new Dimension(500,250));
        add(new Label("jeroen"));
        add (tekstvak);
        add(new Label("Valerie"));
        add(tekstvak2);
        add(new Label("Hans"));
        add(tekstvak3);
        add(knop);



    }


    public void paint(Graphics g) {
        g.drawString("0",35,200);
        g.drawString("20",30,180);
        g.drawString("40",30,160);
        g.drawString("60",30,140);
        g.drawString("80",30,120);
        g.drawString("100",25,100);
        g.drawString("120",25,80);
        g.drawString("140",25,60);
        g.drawString("Jeroen",70,230);
        g.drawString("Valerie",120,230);
        g.drawString("Hans",170,230);
        g.drawLine(50,50,50,200);
        g.drawLine(50, 200, 270, 200);
        g.setColor(Color.red);
        g.fillRect(70,standaard,35, jeroen);
        g.fillRect(120,standaard2,35, valerie);
        g.fillRect(170,standaard4,35, hans);




    }


    private class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jeroen = Integer.parseInt(tekstvak.getText());
           standaard = 200 - jeroen;
            valerie = Integer.parseInt(tekstvak2.getText());
            standaard2 = 200 - valerie;
            hans = Integer.parseInt(tekstvak3.getText());
            standaard4 = 200 - hans;
        repaint();
        }
    }

}