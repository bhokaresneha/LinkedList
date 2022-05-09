package Stack;

import com.bridgelabz.LinkedList;

public class Queue {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        list.display();

        System.out.println("\n**********UC4**********");
        list.pop();     //pop performs Dequeue operation on queue
        list.display();
    }
}