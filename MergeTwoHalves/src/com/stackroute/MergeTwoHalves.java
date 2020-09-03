package com.stackroute;

/*
 *This class contains a method to sort the two sorted arrays
 */
public class MergeTwoHalves {
    public static int[] mergeTwohalves(int[] arrayOne, int[] arrayTwo) {
        int[] resultArray = new int[arrayOne.length + arrayTwo.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arrayOne.length && j < arrayTwo.length) {
            if (arrayOne[i] < arrayTwo[j]) {
                resultArray[k] = arrayOne[i];
                i++;
            } else {
                resultArray[k] = arrayTwo[j];
                j++;

            }
            k++;
        }
        while ((i < arrayOne.length)) {
            resultArray[k] = arrayOne[i];
            i++;
            k++;
        }
        while ((j < arrayTwo.length)) {
            resultArray[k] = arrayTwo[j];
            j++;
            k++;
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] arrayOne = {2, 5, 6, 8};
        int[] arrayTwo = {1, 3, 7, 9};
        int[] sortedArray = mergeTwohalves(arrayOne, arrayTwo);
        System.out.println("Sorted Array is");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }
}
