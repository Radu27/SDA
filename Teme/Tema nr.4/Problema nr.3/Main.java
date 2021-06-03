package com.company;

import java.util.Arrays;

public class Main {
    private static int[] arr;

    private static int[] arraySort(int[] arrays) {

        for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                int tmp = 0;
                if (arrays[i] > arrays[j]) {
                    tmp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = tmp;
                }
            }
        }
        System.out.println("Elementele din sir sortate: " + Arrays.toString(arrays) + "\n");

        return arrays;

    }

    private static boolean binarySearch(int[] array, int value) {

        int first = 0;
        int last = array.length - 1;
        int middle = (first + last) / 2;

        while (first <= last) {

            if (array[first] == value) {
                System.out.println("S-a gasit valoarea " + value);
                return true;
            }
            if (array[last] == value) {
                System.out.println("S-a gasit valoarea " + value);
                return true;
            }

            if (array[middle] < value) {
                first = middle + 1;
            } else if (array[middle] == value) {
                System.out.println("S-a gasit valoarea " + value);
                return true;
            } else if (array[middle] > value) {
                last = middle - 1;
            }


            middle = (first + last) / 2;
        }
        System.out.println("Valoarea " + value + " nu a fost gasita!");
        return false;
    }

    public static void main(String[] args) {
        arr = new int[]{27, 23, 1, 23, 14, 17, 7, 68, 56, 49};
        System.out.println("Elementele din sir sunt: " + Arrays.toString(arr) + "\n");
        arraySort(arr);
        binarySearch(arr, 48);
    }
}

