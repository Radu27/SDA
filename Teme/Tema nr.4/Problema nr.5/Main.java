package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scan;
    private static int[][] arr;
    private static int column, row;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.println("Va rugam sa specificati numarul de randuri: ");
        row = scan.nextInt();
        System.out.println("Va rugam sa specificati numarul de coloane: ");
        column = scan.nextInt();

        arr = new int[row][column];

        System.out.println();
        addBid(row, column);
        modify(row, column);
        System.out.println("\n");
        newArray(row, column);

    }


    private static int[][] addBid(int rows, int columns) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = new Random().nextInt(255);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        return arr;
    }

    private static int[][] newArray(int rows, int columns) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        return arr;
    }

    private static int[][] modify(int rows, int columns) {

        int r = 0;
        int c = 0;

        int r_3 = 3;
        int c_3 = 3;

        int new_row = r_3;
        int new_col = c_3;

        int arithmetic = 0;
        int next_rows = 0;
        boolean checked = false;
        int count;


        System.out.println();

        while (!checked) {

            if(new_row < rows) {
                new_row = r_3;
            }
            else {
                new_row = arr.length;
            }

            if (new_col < columns) {
                new_col = c_3;
            } else {
                new_col = arr[0].length;
                next_rows = 1; // in cazul in care variabila new_col ajunge la ulima coloana, initializam next_rows cu 1, pentru a trece la urmatoarele randuri din matrice.

            }

            count = 0;
            for (int i = r; i < new_row; i++) {
                for (int j = c; j < new_col; j++) {
                    //System.out.print(arr[i][j] + " ");
                    arithmetic += arr[i][j];
                    count += 1;
                }
            }
            arithmetic = arithmetic / count;

            for (int i = r; i < new_row; i++) {
                for (int j = c; j < new_col; j++) {
                    arr[i][j] = arithmetic;

                }
            }
            arithmetic = 0;
            //System.out.print(" | ");

            if (new_row == arr.length && new_col == arr[0].length) {
                checked = true;
            }

            c += 3;
            c_3 += 3;


            if (new_col < columns) {
                new_col = c_3;
            }
            else {
                new_col = arr[0].length;
            }


            if (c >= new_col) { //daca valoarea variabilei c ar fi fost mai mare decat valoarea variabilei new_col, atunci reinitializam variabila c cu 0.
                c = 0;
            }

            if (next_rows == 1) {
                r += 3; // am incrementat variabila r cu 3
                r_3 += 3; // am incrementat variabila r_3 cu 3


                if (new_row + 3 < rows) { // aici verifica daca variabila adunata cu 3 este mai mica decat variabila rows
                    new_row = r_3; //daca da, initializam new_row cu r_3.
                }
                else {
                    new_row = arr.length; //daca nu, initializam new_row cu nr de randuri.
                }


                if (r >= new_row) { // aici daca variabila r este mai mare decat new_row, initializam r cu 0.
                    r = 0;
                }
                next_rows = 0; //initializam variabila cu 0, pentru ca daca nu, operatiile din interiorul acestei bucle if vor fi executate de fiecare data.

                c = 0;
                c_3 = 3;
                new_col = 3;
            }
        }
        return arr;
    }
}