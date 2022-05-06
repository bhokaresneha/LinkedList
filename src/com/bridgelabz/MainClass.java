package com.bridgelabz;

import java.util.Scanner;

public class MainClass
{

    public static void main(String[] args) 
    {
        System.out.println("************Linked List**********");
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int option;

            System.out.println("Enter the option which operation you want to perform ");
            System.out.println("1.Add Element in the link list \n2.Add Element at The Start of the Link List ");
            option = scanner.nextInt();
            switch (option) 
            {
                case 1:
                    // Adding element into link list
                    list.add(70);
                    list.add(30);
                    list.add(56);
                    list.display();
                    break;
                case 2:
                    //pushing element At the start of the link list
                    list.push(70);
                    list.push(30);
                    list.push(56);
                    list.display();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
    }
}

