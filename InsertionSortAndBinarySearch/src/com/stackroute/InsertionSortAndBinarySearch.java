package com.stackroute;

import java.util.Scanner;
import java.lang.String;

/*
 *This class contains methods to sort the elements using insertion sort and search the element using binary search
 */
public class InsertionSortAndBinarySearch {
    public static String[] getDetails() {
        Scanner reader = new Scanner(System.in);
        int i;
        System.out.println("Enter elements");
        String[] array = new String[10];
        for (i = 0; i < 10; i++) {
            array[i] = reader.next();
        }
        return array;
    }
    public static void insertionSort(String[] array) {
        String temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.print("Strings in Sorted Order:");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
    }





    public static int doSearch(String[] array) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        String key;
        System.out.println("Enter desired element");
        Scanner reader = new Scanner(System.in);
        key = reader.next();
        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else if (array[mid].compareTo(key) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] string = getDetails();
        insertionSort(string);
        int value = doSearch(string);
        if (value == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element Found");
        }
    }

}
