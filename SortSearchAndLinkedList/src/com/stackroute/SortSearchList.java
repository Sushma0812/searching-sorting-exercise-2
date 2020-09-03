package com.stackroute;

import java.util.Scanner;

public class SortSearchList{
    public static String[] getDetails() {
        Scanner reader = new Scanner(System.in);
        int i;
        System.out.println("Enter elements");
        String[] array = new String[5];
        for (i = 0; i < 10; i++) {
            array[i] = reader.next();
        }
        return array;
    }
    public static void sortStrings(String[] array)
    {
        String temp;

        for (int j = 0; j < array.length - 1; j++)
        {
            for (int i = j + 1; i < array.length; i++)
            {
                if (array[j].compareTo(array[i]) > 0)
                {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
	// write your code here
    }
}
