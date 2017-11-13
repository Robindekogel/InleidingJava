package H12;


import javax.swing.text.TabExpander;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class Praktijkopdracht12 extends Applet {

   private TextField naamText;
   private TextField telefoonText;
   private Button button;
   private String[] namen;
   private String[] nummers;
   private int aantalGeklikt = 0;
   private final static int AANTAL_INVOER = 10;



    public void init() {
        naamText = new TextField(10);
        add(naamText);
        telefoonText = new TextField(10);
        add(telefoonText);
        button = new Button("oke");
        add(button);
        namen = new String[AANTAL_INVOER];
        nummers = new String[AANTAL_INVOER];
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namen[aantalGeklikt] = naamText.getText();
                nummers[aantalGeklikt] = telefoonText.getText();
                aantalGeklikt++;
                if (aantalGeklikt == AANTAL_INVOER);
                repaint();
                aantalGeklikt = 0;

            }
        });

    }

    public void paint(Graphics g) {
        if (aantalGeklikt != 0) {
        int x1 = 50;
        int x2 = 150;
        int y = 70;
        for (int i = 0; i < AANTAL_INVOER; i++) {
            g.drawString(namen[i], x1, y);
            g.drawString(nummers[i], x2, y);
            y += 20;
            }
        }

    }

}


