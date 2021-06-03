package com.company;

import java.util.*;
import java.io.InvalidClassException;

public class Main {

    public static void countFrequencies(List<String> list) {

        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (String i : list) {
            Integer j = hm.get(i); // in aceasta bucla se itereaza un array de tip List cu parametru String si verifica daca String ul a fost adaugat in hm sau nu.
                                   // daca a fost, atunci se incrementeaza valoarea, daca nu ii adaugam valoarea 1.
            if (j == null) {
                hm.put(i, 1);
            } else {
                hm.put(i, j + 1);
            }
        }
        for (Map.Entry<String, Integer> val : hm.entrySet()) { // am folosit aceasta bucla pentru a putea accesa mai multe functii.
                                                               // Spre exemplu, functiile getValue() si getKey() pentru a imi returna String-ul si valoarea acestuia
            System.out.println(val.getKey() + " - "
                    + val.getValue());
        }
    }

    public static void main(String[] args) {

        List<String> lhex = new ArrayList<String>();

        try {
            List<Shape> shapes = new ArrayList<>();


            Cerc c1 = new Cerc(200, "#33FFFD", false);
            shapes.add(c1);
            Cerc c2 = new Cerc(200, "#33FFFD", true); // E433FF
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
                lhex.add(shapes.get(i).getHexFillColor());
            }
        } catch (Exception e) {
            System.out.println("Codul a returnat o eroare: " + e);
        }
        System.out.println();
        countFrequencies(lhex);

    }
}