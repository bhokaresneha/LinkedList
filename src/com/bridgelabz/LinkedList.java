package com.bridgelabz;

public class LinkedList {
    // variable initialization
    Node head;
    Node tail;

    // Adding element into link list
   public void add(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
   }

  // Displaying element of Linked List
    public void display() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
    }

    //pushing element At the start of the link list
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

}