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
    public void insertAtStart(int data) {
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

    //pushing element At the end of the link list
    public void insertAtEnd(int data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    /* instering element at in-between */

    // search() function for searching element in link list
    public Node search(int data){

        Node temp = head;
        while(temp != null){
            if(temp.data == data)
            {
                return temp;

            }
            temp = temp.next;

        }
        return null;
    }

    // inserting element after particular element
    public void insertAfter(int prevNodeData, int data) {
        Node newNode = new Node(data);
        // calling search function with previous node and serch function returning the address for new element that stored in searchednode variable
        Node searchedNode = this.search(prevNodeData);
        // traversing  linked list till condition not get false
        if( searchedNode!= null){
            // next element of serched node is stored in tempNode variable
            Node tempNode = searchedNode.next;

           // new node assigned to serched nodes next  position
            searchedNode.next = newNode;
            // Assigning next elemnet of searched node to the new one next
            newNode.next = tempNode;
        }
    }

    // Deleting First Element of Linked List
    public void pop()
    {
        if (head != null){
            Node temp = head;
            head = head.next;
        }
    }

    //Deleting Last Element Of Linked List
    public  void popLastElement()
    {
        Node temp = head;
        Node prevNode = null;
        while (temp.next != null)
        {
            prevNode = temp;
            temp = temp.next;
        }
        prevNode.next = null;
    }

}

