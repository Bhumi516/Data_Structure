package LAB7;
import java.util.Scanner;

// Different node class name
class DNode {
    int data;
    DNode prev, next;

    DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

// Different main class
public class DoublyLinkedList {

    static DNode head = null;

    // Insert at beginning
    static void insertBeginning(int value) {
        DNode newNode = new DNode(value);

        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }

        head = newNode;
        System.out.println("Inserted at beginning: " + value);
    }

    // Insert at end
    static void insertEnd(int value) {
        DNode newNode = new DNode(value);

        if (head == null) {
            head = newNode;
        } else {
            DNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.prev = temp;
        }

        System.out.println("Inserted at end: " + value);
    }

    // Delete element
    static void deleteNode(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        DNode temp = head;

        // If first node
        if (temp.data == value) {
            head = temp.next;
            if (head != null)
                head.prev = null;

            System.out.println("Deleted: " + value);
            return;
        }

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Element not found");
            return;
        }

        if (temp.next != null)
            temp.next.prev = temp.prev;

        if (temp.prev != null)
            temp.prev.next = temp.next;

        System.out.println("Deleted: " + value);
    }

    // Display list
    static void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        DNode temp = head;

        System.out.println("Doubly Linked List:");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- DOUBLY LINKED LIST ---");
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
                    insertBeginning(value);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    insertEnd(value);
                    break;

                case 3:
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();
                    deleteNode(value);
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