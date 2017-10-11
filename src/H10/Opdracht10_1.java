package H10;




        import java.awt.*;
        import java.applet.*;
        import java.awt.event.*;


public class Opdracht10_1 extends Applet {
    TextField tekstvak;
    Label label;
    String tekst;
    int s = 0;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";
        label = new Label("Vul hier een getal in" );
        add( label );
        add( tekstvak );
    }

    public void paint(Graphics g) {
        g.drawString("" + s, 50, 45 );
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {

            if (s < Integer.parseInt( tekstvak.getText())){
            s = Integer.parseInt( tekstvak.getText());
            repaint();
            }
        }
    }
}