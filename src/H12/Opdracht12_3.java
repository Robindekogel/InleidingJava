package H12;


import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class Opdracht12_3 extends Applet {

    TextField[] textFields;
    Button Button;
    int aantalvelden = 5;


    public void init() {
        textFields = new TextField[aantalvelden];
        for (int i = 0; i < textFields.length; i++) {
            textFields[i] = new TextField();
            add(textFields[i]);
        }
        Button = new Button("oke");
        add(Button);
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] invoer = new int[aantalvelden];
                for (int i = 0; i < aantalvelden ; i++) {
                    String s = textFields[i].getText();
                    int input = Integer.parseInt(s);
                    invoer[i] = input;
                }
                Arrays.sort(invoer);
                for (int i = 0; i < aantalvelden; i++) {
                    textFields[i].setText(String.valueOf(invoer[i]));

                }
            }
        });

    }



    public void paint(Graphics g) {


    }

}


