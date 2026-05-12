package LAB7;
import java.util.Scanner;

class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLinkedList {
    static StackNode top = null;

    // Push operation
    static void push(int value) {
        StackNode newNode = new StackNode(value);

        newNode.next = top;
        top = newNode;

        System.out.println("Pushed: " + value);
    }

    // Pop operation
    static void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + top.data);
            top = top.next;
        }
    }

    // Display operation
    static void display() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            StackNode temp = top;

            System.out.println("Stack elements:");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- STACK USING LINKED LIST ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    push(value);
                    break;

                case 2:
                    pop();
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
