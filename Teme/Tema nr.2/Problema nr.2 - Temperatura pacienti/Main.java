package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int i = 0;
        float temperatura;
        float temperaturi[] = new float[1000];
        Scanner stdin = new Scanner(System.in);

        try {
            System.out.println("Pentru a opri programul introduceti valoarea 0");
            System.out.println("Introduceti temperatura primului pacient: ");
            temperatura = stdin.nextFloat();
            while(temperatura != 0)
            {
                    temperaturi[i] = temperatura;
                    i++;
                System.out.println("Introduceti temperatura pacientului " + i + ":");
                temperatura = stdin.nextFloat();
            }
            System.out.println("Temperaturi normale: \n");
            for(int k = 0; k < i; k++)
            {
                if(temperaturi[k] <= 37)
                    System.out.println("Id pacient: " + k + " || Temperatura: " + temperaturi[k]);
            }

            System.out.println("\nTemperaturi anormale: \n");
            for(int k = 0; k < i; k++)
            {
                if(temperaturi[k] > 37)
                    System.out.println("Id pacient: " + k + " || Temperatura: " + temperaturi[k]);
            }

        }
        catch (InputMismatchException e)
        {
            System.out.println("Ati introdus o valoarea care nu este un numar");
        }
        catch(Exception e)
        {
            System.out.println("Ceva nu a functionat cum trebuie");
        }

    }
}