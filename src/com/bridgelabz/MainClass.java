package com.bridgelabz;


public class MainClass
{

    public static void main(String[] args) {
        System.out.println("************Linked List**********");
        int option;
            OperationCall operationCall=new OperationCall();
            System.out.println("Enter the option which operation you want to perform ");
            System.out.println("1.Add Element in the link list \n2.Add Element at The Start of the Link List\n3.Add Element at The End of the Link List \n4.Insert Element In-Between Elements" +
                    "\n5.Remove the First Element From Linked List\n6.Remove the Last Element From Linked List\n7.Searching Element in Linked List7  ");
            option = operationCall.scanner.nextInt();
            switch (option) {
                case 1:
                    // Adding element into link list
                    operationCall.add();
                      break;
                case 2:
                    //pushing element At the start of the link list
                    operationCall.insertAtStart();
                    break;
                case 3:
                    //pushing element At the start of the link list
                    operationCall.insertAtEnd();
                    break;
                case 4:
                    operationCall.insertAfter();
                    break;
                case 5:
                    operationCall.pop();
                    break;
                case 6:
                    operationCall.popLastElement();
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
    }
}

