package com.company;

import java.util.Scanner;
import java.lang.*;

public class Main {

    static int vitezaDrum1(String s) {
        if (s.equals("Zona rezidentiala"))
            return 30;
        else if (s.equals("Oras"))
            return 50;
        else if (s.equals("Drum express"))
            return 100;
        else if (s.equals("Autostrada"))
            return 130;
        else
            return 0;
    }

    static int vitezaDrum2(String s) {
        if (s.equals("Zona rezidentiala"))
            return 30;
        else {
            if (s.equals("Oras"))
                return 50;
            else {
                if (s.equals("Drum express"))
                    return 100;
                else {
                    if (s.equals("Autostrada"))
                        return 130;
                    else
                        return 0;
                }
            }
        }
    }

    static int vitezaDrum3(String s) {
        int viteza;
        switch (s) {
            case "Zona rezidentiala":
                viteza = 30;
                break;
            case "Oras":
                viteza = 50;
                break;
            case "Drum express":
                viteza = 100;
                break;
            case "Autostrada":
                viteza = 130;
                break;
            default:
                viteza = 0;
        }
        return viteza;
    }

    public static void main(String[] args) {
        String tipDrum;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Introduceti tipul de drum (Zona rezidentiala, Oras, Drum express, Autostrada): ");
        tipDrum = stdin.nextLine();
        System.out.println("Viteza cu prima functie: " + vitezaDrum1(tipDrum));
        System.out.println("Viteza cu a doua functie: " + vitezaDrum2(tipDrum));
        System.out.println("Viteza cu a treia functie: " + vitezaDrum3(tipDrum));

    }
}