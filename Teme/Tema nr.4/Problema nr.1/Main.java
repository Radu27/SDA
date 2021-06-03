package com.company;

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {

    public static int[] insertX(int arr[], int x, int pos) {
        int i;
        int newarr[] = new int[11];

        for (i = 0; i < 11; i++) {
            if (i < pos)
                newarr[i] = arr[i];
            else if (i == pos)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }

    public static void main(String[] args) {
        int arr[] = {12, 25, 47, 58, 47, 7, 96, 14, 3, 9};
        System.out.println("Sirul initial: " + Arrays.toString(arr));

        int x;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Introduceti numarul ce urmeaza a fi introdus in sir: ");
        x = s1.nextInt();

        int pos;
        Scanner s2 = new Scanner(System.in);
        System.out.println("Introduceti pozitia pe care va fi introdus numarul(0-10): ");
        pos = s2.nextInt();

        arr = insertX(arr, x, pos);

        System.out.println("Sirul cu " + x + " inserat pe pozitia " + pos + ":\n" + Arrays.toString(arr));
    }
}