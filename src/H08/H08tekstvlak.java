import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H08tekstvlak extends Applet {
        TextField tekstvlak;
        Label label;
        String s;

        public void init() {
        tekstvlak = new TextField(" ",20);
        label = new Label("Type iets in het tekstvakje" + "en druk op enter");
        tekstvlak.addActionListener( new tekstvlakListener() );
        add (label);
        add ( tekstvlak);
        s = "";
        }

        public void paint (Graphics g) {
        g.drawString(s, 50,50);

        }

        class  tekstvlakListener implements ActionListener {
                public void actionPerformed (ActionEvent e) {
                        s = tekstvlak.getText();
                        repaint();
                }
        }
}
