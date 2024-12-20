package javaprograms;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Method to delete a node with a given value
    public void delete(int data) {
        if (head == null) return;

        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next; // if head is to be deleted
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
                return; // Element found and deleted
            }
            temp = temp.next;
        }
        System.out.println("Element " + data + " not found in the list.");
    }

    // Method to display the contents of the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        // Getting user input for inserting elements
        System.out.println("Enter elements to insert into the doubly linked list (type -1 to stop):");
        while (true) {
            int data = scanner.nextInt();
            if (data == -1) break;  // stop input if user enters -1
            list.insert(data);
        }

        System.out.println("Original list:");
        list.display();

        // Getting user input for deleting an element
        System.out.print("Enter an element to delete from the list: ");
        int elementToDelete = scanner.nextInt();
        System.out.println("Deleting element: " + elementToDelete);
        list.delete(elementToDelete);

        // Displaying the list after deletion
        System.out.println("List after deletion:");
        list.display();
        
        scanner.close();
    }
}
