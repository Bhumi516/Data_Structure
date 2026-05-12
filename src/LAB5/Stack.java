package LAB5;

import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] stack = new int[5];
        int top = -1;

        // PUSH operation
        System.out.print("Enter element to push: ");
        int value = sc.nextInt();

        if (top == 4) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            stack[top] = value;
            System.out.println("Element pushed: " + value);
        }

        // POP operation
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Element popped: " + stack[top]);
            top = top - 1;
        }
    }
}

