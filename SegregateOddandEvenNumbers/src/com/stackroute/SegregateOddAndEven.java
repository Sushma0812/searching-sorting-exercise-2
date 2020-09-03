package com.stackroute;

import java.util.Scanner;

public class SegregateOddAndEven {
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

    public static int[] separate(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            /* Increment left index while we see 0 at left */
            while (array[left] % 2 == 0 && left < right)
                left++;

            /* Decrement right index while we see 1 at right */
            while (array[right] % 2 == 1 && left < right)
                right--;

            if (left < right) {
                /* Swap arr[left] and arr[right]*/
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arrayOne = getDetails();
        System.out.print("{");

        for (int i = 0; i <arrayOne.length; i++) {
            System.out.print(arrayOne[i]);
            System.out.print(" ");
        }
        System.out.print("}");
        System.out.println("");
        int[] resultArray = separate(arrayOne);
        System.out.println("Segregate elements");
        System.out.println("");
        System.out.print("{");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            System.out.print(" ");
        }
        System.out.print("}");


    }
}

