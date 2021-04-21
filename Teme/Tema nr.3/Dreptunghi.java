package com.company;

import javax.swing.*;
import java.awt.*;

public class Dreptunghi extends JFrame implements Shape {
    private int inaltime, latime;
    boolean fill = false;
    private String hexValue;
    HexColorValidator validator = new HexColorValidator();
    final static private String nume = "Dreptunghi";

    public Dreptunghi() {
        latime = 60;
        inaltime = 30;
        hexValue = "#000000";
        fill = false;
    }

    public Dreptunghi(int latime, int inaltime, String hexValue) {
        if (latime < 0) throw new IllegalArgumentException("Latimea trebuie sa fie pozitiva");
        if (inaltime < 0) throw new IllegalArgumentException("Inaltimea trebuie sa fie pozitiva");
        this.latime = latime;
        this.inaltime = inaltime;
        this.fill = false;
        if (validator.validate(hexValue))
            this.hexValue = hexValue;
        else
            this.hexValue = "#000000";
    }

    public Dreptunghi(int latime, int inaltime, String hexValue, boolean fill) {
        if (latime < 0) throw new IllegalArgumentException("Latimea trebuie sa fie pozitiva");
        if (inaltime < 0) throw new IllegalArgumentException("Inaltimea trebuie sa fie pozitiva");
        this.latime = latime;
        this.inaltime = inaltime;
        this.fill = fill;
        if (validator.validate(hexValue))
            this.hexValue = hexValue;
        else
            this.hexValue = "#000000";
    }

    public double getArea() {
        return latime * inaltime;
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
        setTitle("Desen Dreptunghi");
        setSize(550, 550);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.decode(hexValue));
        if (fill == true)
            g2d.fillRect(15, 40, latime, inaltime);
        else
            g2d.drawRect(15, 40, latime, inaltime);
    }

    public String toString() {
        draw();
        return "Nume figura: " + this.getName() + " Arie: " + this.getArea() + " Culoare: " + this.getHexFillColor() + " Latime chenar: " + this.getBorderWidth();
    }


}