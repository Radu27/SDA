package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] removeX(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length)   //Daca sirul este gol sau pozitia in afara valorilor, returneaza direct sirul
        {
            return arr;
        }

        int[] arr1 = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {  //Copiaza elementele mai putin indexul

            if (i == index)  //Daca indexul este egal cu i, este eliminata pozitia
            {
                continue;
            }

            arr1[k++] = arr[i];  //Se copiaza sirul vechi in cel nou
        }

        return arr1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 25, 47, 58, 47, 7, 96, 14, 3, 9};
        System.out.println("Sirul initial: " + Arrays.toString(arr));

        int index;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Introduceti pozitia de pe care va fi sters numarul(0-9): ");
        index = s1.nextInt();

        arr = removeX(arr, index);
        System.out.println("Sirul final: " + Arrays.toString(arr));
    }
}