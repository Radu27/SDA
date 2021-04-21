package com.company;

import javax.swing.*;
import java.awt.*;

public class Cerc extends JFrame implements Shape{
    private int raza;
    private boolean fill = false;
    private String hexValue;
    HexColorValidator validator = new HexColorValidator();
    final static private String nume = "Cerc";
    public Cerc(){raza = 30; hexValue = "#000000"; fill = false;}

    public Cerc(int raza, String hexValue)
    {
        if(raza < 0) throw new IllegalArgumentException("Raza trebuie sa fie pozitiva");
        this.raza = raza;
        this.fill = false;
        if(validator.validate(hexValue))
            this.hexValue = hexValue;
        else
            this.hexValue = "#000000";
    }
    public Cerc(int raza, String hexValue, boolean fill)
    {
        if(raza < 0) throw new IllegalArgumentException("Raza trebuie sa fie pozitiva");
        this.raza = raza;
        this.fill = fill;
        if(validator.validate(hexValue))
            this.hexValue = hexValue;
        else
            this.hexValue = "#000000";
    }

    public double getArea(){
        return 3.14159265359 * raza * raza;
    }
    public String getName() {
        return nume;
    }
    public int getBorderWidth(){
        return 550;
    }
    public String getHexFillColor(){
        return hexValue;
    }
    public void draw(){
        setTitle("Desen Cerc");
                setSize(550, 550);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.decode(hexValue));
        if(fill == true)
            g2d.fillOval(10, 15 + raza / 4, 2 * raza, 2 * raza);
        else
            g2d.drawOval(10, 15 + raza / 4, 2 * raza, 2 * raza);
    }

    public String toString() {
        draw();
        return "Nume figura: " + this.getName() + " Arie: " + this.getArea() + " Culoare: " + this.getHexFillColor() + " Latime chenar: " + this.getBorderWidth();
    }



}
