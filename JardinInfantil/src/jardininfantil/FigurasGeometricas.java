package jardininfantil;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class FigurasGeometricas extends Applet implements ActionListener {

    Button b1, b2, b3, b4, b5;
    Label l1;
    String dibuja;

    public FigurasGeometricas() {

        l1 = new Label("                  ");
        b1 = new Button("Triangulo");
        b2 = new Button("Circulo");
        b3 = new Button("Rectangulo");
        b4 = new Button("Cuadrado");
        b5 = new Button("Rombo");
        l1.setAlignment(1);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(l1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            dibuja = "Triangulo"; 
        }
        if (ae.getSource() == b2) {
            dibuja = "Circulo"; 
        }
        if (ae.getSource() == b3) {
            dibuja = "Rectangulo"; 
        }
        if (ae.getSource() == b4) {
            dibuja = "Cuadrado"; 
        }
        if (ae.getSource() == b5) {
            dibuja = "Rombo"; 
        }
        repaint();

    }

    public void paint(Graphics g) {

        if (dibuja == "Triangulo") {

            int coordX[] = {150, 50, 250};
            int coordY[] = {50, 150, 150};
            g.setColor(Color.red);
            g.fillPolygon(coordX, coordY, 3);
            l1.setLocation(120, 180);
            l1.setText(dibuja);
        }
        if (dibuja == "Circulo") {
            g.setColor(Color.red);
            g.fillOval(100, 60, 120, 120);
            l1.setText(dibuja);
        }
        if (dibuja == "Rectangulo") {
            int coordX[] = {50, 50, 250, 250};
            int coordY[] = {50, 150, 150, 50};
            g.setColor(Color.red);
            g.fillPolygon(coordX, coordY, 4);
            l1.setLocation(120, 180);
            l1.setText(dibuja);
        }
        if (dibuja == "Cuadrado") {
            int coordX[] = {100, 100, 200, 200};
            int coordY[] = {50, 150, 150, 50};
            g.setColor(Color.red);
            g.fillPolygon(coordX, coordY, 4);
            l1.setLocation(120, 180);
            l1.setText(dibuja);
        }
        if (dibuja == "Rombo") {
            int coordX[] = {150, 100, 150, 200};
            int coordY[] = {50, 100, 150, 100};
            g.setColor(Color.red);
            g.fillPolygon(coordX, coordY, 4);
            l1.setLocation(120, 180);
            l1.setText(dibuja);
        }
    }
}
