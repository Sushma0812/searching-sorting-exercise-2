package com.stackroute;

public class SingleLinkedListAndBinarySearch {


}
// Java code to implement binary search
// on Singly Linked List
class Node
{
    int data;
    Node next;

    // Constructor to create a new node
    Node(int dataOne)
    {
        data = dataOne;
        next = null;
    }
}

class BinarySearch
{
    // function to insert a node at the beginning
    // of the Singaly Linked List
    static Node push(Node head, int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    // Function to find middle element
    // using Fast and Slow pointers
    static Node middleNode(Node start, Node last)
    {
        if (start == null)
            return null;

        Node startOne = start;
        Node nextOne = start.next;

        while (nextOne != last)
        {
            nextOne = nextOne.next;
            if (nextOne != last)
            {
                startOne = startOne.next;
                nextOne = nextOne.next;
            }
        }
        return startOne;
    }

    // function to insert a node at the beginning
    // of the Singly Linked List
    static Node binarySearch(Node head, int value)
    {
        Node start = head;
        Node last = null;

        do
        {
            Node mid = middleNode(start, last);

            if (mid == null)
                return null;

            if (mid.data == value)
                return mid;

            else if (mid.data > value)
            {
                start = mid.next;
            }

            else
                last = mid;
        } while (last == null || last != start);

        return null;
    }

    public static void main(String[] args)
    {
        Node head = null;


        head = push(head, 10);
        head = push(head, 30);
        head = push(head, 23);
        head = push(head, 82);
        head = push(head, 95);
        head = push(head, 44);
        int value = 73;

        if (binarySearch(head, value) == null)
        {
            System.out.println("Value not present");
        }
        else
        {
            System.out.println("Present");
        }
    }
}