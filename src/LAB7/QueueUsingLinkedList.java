package LAB7;
import java.util.Scanner;

class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class QueueUsingLinkedList {
    static QueueNode front = null;
    static QueueNode rear = null;

    // Enqueue operation
    static void enqueue(int value) {
        QueueNode newNode = new QueueNode(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println("Inserted: " + value);
    }

    // Dequeue operation
    static void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted: " + front.data);
            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
    }

    // Display operation
    static void display() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            QueueNode temp = front;

            System.out.println("Queue elements:");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- QUEUE USING LINKED LIST ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    enqueue(value);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.println("Program exited");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);
    }
}
