package com.stackroute;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Arrays.*;
/*
 *This class contains methods to sort even elements and odd elements and display even elements in increasing order and odd elements in decreasing order
 */

public class SortEvenAndOdd {
    public static int[] getDetails() {
        Scanner reader = new Scanner(System.in);
        int i;
        System.out.println("Enter elements");
        int[] array = new int[10];
        for (i = 0; i < 10; i++) {
            array[i] = reader.nextInt();
        }
        return array;
    }


    public static void doSort(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (isEven(array[i]) && isOdd(array[j])) {
                i++;
                j--;
            } else if (!isEven(array[i]) && !isOdd(array[j])) {
                swap(i, j, array);
            } else if (isEven(array[i])) {
                i++;
            } else {
                j--;
            }

        }

        Arrays.sort(array, 0, i);
        insertionSort(array, i, array.length);

    }

    public static void insertionSort(int[] array, int firstIndex, int lastIndex) {
        for (int i = firstIndex + 1; i < lastIndex; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= firstIndex && key > array[j]) {
                array[j + 1] = array[j];
                array[j] = key;
                j = j - 1;
            }
        }
        display(array);

    }

    public static void display(int[] arr) {
        System.out.println("\n");
        for (int val : arr) {
            System.out.print(val + "  ");
        }
    }

    private static void swap(int pos1, int pos2, int[] arr) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static boolean isOdd(int i) {
        return (i & 1) != 0;
    }

    public static boolean isEven(int i) {
        return (i & 1) == 0;
    }

    public static void main(String[] args) {
        int[] arrayOne = getDetails();
        doSort(arrayOne);

    }
}