package com.bridgelabz;
import java.util.Scanner;


public class OperationCall {
    LinkedList list = new LinkedList();
    Scanner scanner = new Scanner(System.in);

    public void add(){
        list.add(70);
        list.add(30);
        list.add(56);
        list.display();
    }
    public void insertAtStart()
    {
        list.insertAtStart(70);
        list.insertAtStart(30);
        list.insertAtStart(56);
        list.display();
    }

    public void insertAtEnd()
    {
        list.insertAtEnd(56);
        list.insertAtEnd(30);
        list.insertAtEnd(70);
        list.display();

    }
    public void insertAfter()
    {
        System.out.println("Linked List Before adding element in-between");
        add();
        list.insertAfter(70,88);
        System.out.println("\nLinked List After adding element in-between");
        list.display();

    }
    public void pop()
    {
        System.out.println("Linked List Before removing First element ");
        add();
        list.pop();
        System.out.println("\nLinked List After removing First element ");
        list.display();
    }
    public void popLastElement()
    {
        System.out.println("Linked List Before removing Last element ");
        add();
        list.popLastElement();
        System.out.println("\nLinked List After removing Last element ");
        list.display();
    }

    public  void search(){
        add();

        list.search(88);

    }

}