package com.stackroute;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class SortSearchLinkedList {
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
    void bubbleSort(String[] array,int size){
        String temp;

        //sorting items using bubble sort
        for (int i=0;i<size-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i].compareTo(array[j])>0){
                    temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(i+":"+array[i]);
        }
    }
    public static String[] Add(String[] array){
        LinkedList list = new LinkedList();
        for(int i=0;i<array.length;i++){
            list.add(array[i]);
        }
        System.out.println(Arrays.toString(array));
        return null;
    }
    public int search(String[] array)
    {
        int i;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the item to be searched");
        String key=reader.next();
        for(i = 0; i<10; i++)
        {
            if (key.equals(array[i]))
            {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        String[] strings = getDetails();
        SortSearchLinkedList searchLinkedList=new SortSearchLinkedList();
        Scanner reader=new Scanner(System.in);
        //printing strings before sorting
        for (int i=0;i<strings.length;i++){
            System.out.println(i+":"+strings[i]);
        }
        Add(strings);
        searchLinkedList.bubbleSort(strings,strings.length);
        int value =  searchLinkedList.search(strings);
       if(value == -1){
           System.out.println("Element not found");
       }
       else{
           System.out.println("Element found");
       }
    }


}


