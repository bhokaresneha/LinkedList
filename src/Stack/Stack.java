package Stack;

import com.bridgelabz.LinkedList;

public class Stack {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("Welcome To Stack Programme");
        System.out.println("************UC1**********");
        list.add(70);
        list.add(30);
        list.add(56);
        list.display();

        System.out.println("************UC2***********");
        System.out.println("Size:: "+list.size());
        System.out.println("Befor pop operation stack:");
        list.display();
        while(list.size() != 0){
            list.pop();
        }
        System.out.println("\nAfter pop operation:");
        list.display();
        System.out.println("\nThe Stack is empty....");

    }
    }

