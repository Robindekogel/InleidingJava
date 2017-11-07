package H12;


        import java.awt.*;
        import java.applet.*;




public class Opdracht12_2 extends Applet {


    public void init() {
        Button[] buttons;
        buttons = new Button[25];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button("" + i);
            add(buttons[i]);
        }
        this.setSize(new Dimension(150,180));
        repaint();

    }



    public void paint(Graphics g) {


    }

}


