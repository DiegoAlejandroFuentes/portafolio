package jardininfantil;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Locale;

public class Colores extends Applet implements ItemListener {

    List ch1, ch2;
    Label l1, l2;

    public Colores() {

        l1 = new Label(" ");
        l2 = new Label(" ");
        ch1 = new List();
        ch2 = new List();
        ch1.add("Amarillo");
        ch1.add("Azul");
        ch1.add("Rojo");
        ch2.add("Amarillo");
        ch2.add("Azul");
        ch2.add("Rojo");
        add(ch1);
        add(ch2);
        add(l1);
        add(l2);
        ch1.addItemListener(this);
        ch2.addItemListener(this);

    }

    public void itemStateChanged(ItemEvent ie) {
        setSize(new Dimension(400, 300));
        repaint();
    }

    public void paint(Graphics g) {

        if (ch1.getSelectedItem() == "Amarillo" && ch2.getSelectedItem() == "Azul") {
            int coordX1[] = {50, 50, 100, 100};
            int coordY1[] = {100, 150, 150, 100};
            g.setColor(Color.yellow);
            g.fillPolygon(coordX1, coordY1, 4);
            int coordX2[] = {150, 150, 200, 200};
            int coordY2[] = {100, 150, 150, 100};
            g.setColor(Color.BLUE);
            g.fillPolygon(coordX2, coordY2, 4);
            int coordX3[] = {250, 250, 300, 300};
            int coordY3[] = {100, 150, 150, 100};
            g.setColor(Color.GREEN);
            g.fillPolygon(coordX3, coordY3, 4);
            Font Fuente = new Font("Dialog", Font.BOLD, 28);
            l1.setFont(Fuente);
            l2.setFont(Fuente);
            l1.setLocation(125, 120);
            l1.setText("+");
            l2.setLocation(225, 120);
            l2.setText("=");
        }
        if (ch1.getSelectedItem() == "Amarillo" && ch2.getSelectedItem() == "Rojo") {
            int coordX1[] = {50, 50, 100, 100};
            int coordY1[] = {100, 150, 150, 100};
            g.setColor(Color.yellow);
            g.fillPolygon(coordX1, coordY1, 4);
            int coordX2[] = {150, 150, 200, 200};
            int coordY2[] = {100, 150, 150, 100};
            g.setColor(Color.RED);
            g.fillPolygon(coordX2, coordY2, 4);
            int coordX3[] = {250, 250, 300, 300};
            int coordY3[] = {100, 150, 150, 100};
            g.setColor(Color.ORANGE);
            g.fillPolygon(coordX3, coordY3, 4);
            Font Fuente = new Font("Dialog", Font.BOLD, 28);
            l1.setFont(Fuente);
            l2.setFont(Fuente);
            l1.setLocation(125, 120);
            l1.setText("+");
            l2.setLocation(225, 120);
            l2.setText("=");
        }
        if (ch1.getSelectedItem() == "Azul" && ch2.getSelectedItem() == "Amarillo") {
            int coordX1[] = {50, 50, 100, 100};
            int coordY1[] = {100, 150, 150, 100};
            g.setColor(Color.BLUE);
            g.fillPolygon(coordX1, coordY1, 4);
            int coordX2[] = {150, 150, 200, 200};
            int coordY2[] = {100, 150, 150, 100};
            g.setColor(Color.YELLOW);
            g.fillPolygon(coordX2, coordY2, 4);
            int coordX3[] = {250, 250, 300, 300};
            int coordY3[] = {100, 150, 150, 100};
            g.setColor(Color.GREEN);
            g.fillPolygon(coordX3, coordY3, 4);
            Font Fuente = new Font("Dialog", Font.BOLD, 28);
            l1.setFont(Fuente);
            l2.setFont(Fuente);
            l1.setLocation(125, 120);
            l1.setText("+");
            l2.setLocation(225, 120);
            l2.setText("=");
        }
        if (ch1.getSelectedItem() == "Azul" && ch2.getSelectedItem() == "Rojo") {
            int coordX1[] = {50, 50, 100, 100};
            int coordY1[] = {100, 150, 150, 100};
            g.setColor(Color.BLUE);
            g.fillPolygon(coordX1, coordY1, 4);
            int coordX2[] = {150, 150, 200, 200};
            int coordY2[] = {100, 150, 150, 100};
            g.setColor(Color.RED);
            g.fillPolygon(coordX2, coordY2, 4);
            int coordX3[] = {250, 250, 300, 300};
            int coordY3[] = {100, 150, 150, 100};
            g.setColor(Color.MAGENTA);
            g.fillPolygon(coordX3, coordY3, 4);
            Font Fuente = new Font("Dialog", Font.BOLD, 28);
            l1.setFont(Fuente);
            l2.setFont(Fuente);
            l1.setLocation(125, 120);
            l1.setText("+");
            l2.setLocation(225, 120);
            l2.setText("=");
        }
        if (ch1.getSelectedItem() == "Rojo" && ch2.getSelectedItem() == "Amarillo") {
            int coordX1[] = {50, 50, 100, 100};
            int coordY1[] = {100, 150, 150, 100};
            g.setColor(Color.red);
            g.fillPolygon(coordX1, coordY1, 4);
            int coordX2[] = {150, 150, 200, 200};
            int coordY2[] = {100, 150, 150, 100};
            g.setColor(Color.yellow);
            g.fillPolygon(coordX2, coordY2, 4);
            int coordX3[] = {250, 250, 300, 300};
            int coordY3[] = {100, 150, 150, 100};
            g.setColor(Color.orange);
            g.fillPolygon(coordX3, coordY3, 4);
            Font Fuente = new Font("Dialog", Font.BOLD, 28);
            l1.setFont(Fuente);
            l2.setFont(Fuente);
            l1.setLocation(125, 120);
            l1.setText("+");
            l2.setLocation(225, 120);
            l2.setText("=");
        }
        if (ch1.getSelectedItem() == "Rojo" && ch2.getSelectedItem() == "Azul") {
            int coordX1[] = {50, 50, 100, 100};
            int coordY1[] = {100, 150, 150, 100};
            g.setColor(Color.red);
            g.fillPolygon(coordX1, coordY1, 4);
            int coordX2[] = {150, 150, 200, 200};
            int coordY2[] = {100, 150, 150, 100};
            g.setColor(Color.BLUE);
            g.fillPolygon(coordX2, coordY2, 4);
            int coordX3[] = {250, 250, 300, 300};
            int coordY3[] = {100, 150, 150, 100};
            g.setColor(Color.magenta);
            g.fillPolygon(coordX3, coordY3, 4);
            Font Fuente = new Font("Dialog", Font.BOLD, 28);
            l1.setFont(Fuente);
            l2.setFont(Fuente);
            l1.setLocation(125, 120);
            l1.setText("+");
            l2.setLocation(225, 120);
            l2.setText("=");
        }
        if (ch1.getSelectedItem() == ch2.getSelectedItem()) {
            l1.setText("");
            l2.setText("");
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 400, 400);
        }
    }

}
