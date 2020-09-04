package com.stackroute;

class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int dataOne) {
        data = dataOne;
        next = null;
    }
}

class BinarySearch {
    //this function is used to insert a node at the beginning
    static Node push(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    // this function is used to insert elements at middle of the list
    static Node middleNode(Node start, Node last) {
        if (start == null)
            return null;

        Node startOne = start;
        Node nextOne = start.next;

        while (nextOne != last) {
            nextOne = nextOne.next;
            if (nextOne != last) {
                startOne = startOne.next;
                nextOne = nextOne.next;
            }
        }
        return startOne;
    }

    // this function is used to insert a node at starting of the list
    static Node binarySearch(Node head, int value) {
        Node start = head;
        Node last = null;

        do {
            Node mid = middleNode(start, last);

            if (mid == null)
                return null;

            if (mid.data == value)
                return mid;

            else if (mid.data > value) {
                start = mid.next;
            } else
                last = mid;
        } while (last == null || last != start);

        return null;
    }

    public static void main(String[] args) {
        Node head = null;
        head = push(head, 10);
        head = push(head, 30);
        head = push(head, 23);
        head = push(head, 82);
        head = push(head, 95);
        head = push(head, 44);
        int value = 73;

        if (binarySearch(head, value) == null) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found");
        }
    }
}