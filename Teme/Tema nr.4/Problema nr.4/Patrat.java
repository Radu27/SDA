package com.company;

import javax.swing.*;
import java.awt.*;

public class Patrat extends JFrame implements Shape {
    private int lungime;
    boolean fill = false;
    private String hexValue;
    HexColorValidator validator = new HexColorValidator();
    final static private String nume = "Patrat";

    public Patrat() {
        lungime = 60;
        hexValue = "#000000";
        fill = false;
    }

    public Patrat(int lungime, String hexValue) {
        if (lungime < 0) throw new IllegalArgumentException("Lungimea trebuie sa fie pozitiva");
        this.lungime = lungime;
        this.fill = false;
        if (validator.validate(hexValue))
            this.hexValue = hexValue;
        else
            this.hexValue = "#000000";
    }

    public Patrat(int lungime, String hexValue, boolean fill) {
        if (lungime < 0) throw new IllegalArgumentException("Lungimea trebuie sa fie pozitiva");
        this.lungime = lungime;
        this.fill = fill;
        if (validator.validate(hexValue))
            this.hexValue = hexValue;
        else
            this.hexValue = "#000000";
    }

    public double getArea() {
        return lungime * lungime;
    }

    public String getName() {
        return nume;
    }

    public int getBorderWidth() {
        return 550;
    }

    public String getHexFillColor() {
        return hexValue;
    }

    public void draw() {
        setTitle("Desen Patrat");
        setSize(550, 550);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.decode(hexValue));
        if (fill == true)
            g2d.fillRect(15, 40, lungime, lungime);
        else
            g2d.drawRect(15, 40, lungime, lungime);

    }

    public String toString() {
        draw();
        return "Nume figura: " + this.getName() + " Arie: " + this.getArea() + " Culoare: " + this.getHexFillColor() + " Latime chenar: " + this.getBorderWidth();
    }


}