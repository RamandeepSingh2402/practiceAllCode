package LearningDataStructures;
import java.io.*;

public class LinkedList {

    //This is the head of the list
    public Node head;

    //This is going be the data inside the node
    public String item;

    //LinkedList
    //public LinkedList list;

    //Linked list node
    //This inner class is made static, so that main() can access it
    static class Node{

        String data;
        Node next;

        //Constructor
        Node(String data){
            this.data = data;
            next = null;
        }
    }
    //Constructor
      public LinkedList(){

      }

    //Adding a new node
    public void add(LinkedList list, String data){
        this.item = data;
        Node newNode = new Node(item);
        newNode.next = null;

        //If the LinkedList is empty, then make the new node as head

        if(list.head == null){
            list.head = newNode;
        }
        else{
            //Else traverse till the last node, and insert the newNode at the end
            Node last = list.head;
            while(last.next!= null){
                last = last.next;
            }
            //Inserting the new node at the last
            last.next = newNode;
        }
    }

    //Method to print the LinkedList

    public void print(LinkedList list){
        Node currentNode = list.head;
        System.out.print("LinkedList: ");
        //Traversing through the LinkedList
        while(currentNode != null){
            //Printing the data at the current node
            System.out.print(currentNode.data + ", ");

            //Going to the next node
            currentNode = currentNode.next;
        }
    }

}

