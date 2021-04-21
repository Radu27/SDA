package com.company;

import java.util.*;
import java.io.InvalidClassException;

public class Main {

    public static void main(String[] args) {
        try {
            List<Shape> shapes = new ArrayList<>();
            Cerc c1 = new Cerc(200, "#33FFFD", false);
            shapes.add(c1);
            Cerc c2 = new Cerc(200, "#E433FF", true);
            shapes.add(c2);
            Dreptunghi d1 = new Dreptunghi(300, 150, "#FFFE33", true);
            shapes.add(d1);
            Dreptunghi d2 = new Dreptunghi(300, 150, "#9DFF33", true);
            shapes.add(d2);
            Patrat p1 = new Patrat(300, "#33AAFF", false);
            shapes.add(p1);
            Patrat p2 = new Patrat(300, "#334EFF", true);
            shapes.add(p2);

            for (int i = 0; i < shapes.size(); i++) {
                System.out.println(shapes.get(i));
            }
        } catch (Exception e) {
            System.out.println("Codul a returnat o eroare: " + e);
        }
    }
}