package LAB8;
import java.util.Scanner;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {

    static Node head = null;

    // Insert at beginning
    static void insertAtBeginning(int value) {
        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;

        System.out.println("Inserted at beginning: " + value);
    }

    // Insert at end
    static void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println("Inserted at end: " + value);
    }

    // Delete element
    static void delete(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == value) {
            head = head.next;
            System.out.println("Deleted: " + value);
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Element not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Deleted: " + value);
        }
    }

    // Display list
    static void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        System.out.println("Linked List:");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- SINGLY LINKED LIST ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    insertAtBeginning(value);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    insertAtEnd(value);
                    break;

                case 3:
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();
                    delete(value);
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Program exited");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
}