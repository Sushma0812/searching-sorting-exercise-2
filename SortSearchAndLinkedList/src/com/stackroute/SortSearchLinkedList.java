package com.stackroute;
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
    void bubbleSort(String[] arr,int n){
        String temp;

        //sorting items using bubble sort
        for (int i=0;i<n-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].compareTo(arr[j])>0){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(i+":"+arr[i]);
        }
    }
    piblic static String[] Add(String[] array){
        Linkedlist<String> list = new LinkedList<String>();
        for(int i=0;i<array.length;i++){
            list.add(array[i]);
        }
        System.out.println(Arrays.toString(array));
        return null;
    }
    void search(String[] arr,String search)
    {
        int i;
        int flag = 0;
        for(i = 0; i<5; i++)
        {
            if (search.equals(arr[i]))
            {
                flag = 1;
                break;
            }

        }
        if (flag ==1) {
            System.out.println("item found at position " + (i + 1));
        }
        else
        {
            System.out.println("item not found.");
        }
    }

    public static void main(String[] args) {
        String[] items = getDetails();
        SortSearchLinkedList obj=new SortSearchLinkedList();
        Scanner sc=new Scanner(System.in);
        //String[] items=new String[5];

        //taking items from user
       /* System.out.println("Enter 5 items");
        for(int i=0;i<items.length;i++){
            items[i]=sc.next();
        }*/

        //printing items before sorting
        for (int i=0;i<items.length;i++){
            System.out.println(i+":"+items[i]);
        }
        Add(items);

        obj.bubbleSort(items,items.length);

        //accepting the search element
        System.out.println("Enter the item to be searched");
        String search=sc.next();
        obj.search(items,search);
    }
}
//SortItem.java
//Displaying SortItems.java.

