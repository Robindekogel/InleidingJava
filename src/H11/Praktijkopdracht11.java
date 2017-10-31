package H11;


import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijkopdracht11 extends Applet {

    TextField textField;
    Button button;
    int invoer;


    public void init() {
        textField = new TextField(8);
        button = new Button("oke");
        add(textField);
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                invoer = Integer.parseInt(textField.getText());
repaint();         }
        });

    }

    public void paint(Graphics g) {
        int teller = 1;
        int y = 60;

            while (teller <= 10) {
                g.drawString("" + teller + " X " + invoer + " = " + (teller *invoer), 60, y);
                y += 20; teller++;
    }
        }
    }

