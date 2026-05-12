package LAB1;

import java.util.Scanner;

public class Array {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            // INSERT / CREATE
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // DISPLAY
            System.out.println("\nArray elements are:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

            // SEARCH
            System.out.print("\n\nEnter element to search: ");
            int key = sc.nextInt();
            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (arr[i] == key) {
                    System.out.println("Element found at position: " + (i + 1));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Element not found");
            }

            //DELETE
            System.out.print("\nEnter element to delete: ");
            int del = sc.nextInt();
            int pos = -1;

            for (int i = 0; i < n; i++) {
                if (arr[i] == del) {
                    pos = i;
                    break;
                }
            }

            if (pos != -1) {
                for (int i = pos; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                n--;

                System.out.println("After deletion:");
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                System.out.println("Element not found, cannot delete");
            }

            //  UPDATE
            System.out.print("\n\nEnter position to update: ");
            int upos = sc.nextInt();

            if (upos >= 1 && upos <= n) {
                System.out.print("Enter new value: ");
                int newVal = sc.nextInt();
                arr[upos - 1] = newVal;

                System.out.println("After update:");
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                System.out.println("Invalid position");
            }

            // SUM
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            System.out.println("\n\nSum of elements = " + sum);

            // MAX & MIN
            int max = arr[0];
            int min = arr[0];

            for (int i = 1; i < n; i++) {
                if (arr[i] > max) max = arr[i];
                if (arr[i] < min) min = arr[i];
            }

            System.out.println("Maximum = " + max);
            System.out.println("Minimum = " + min);

            // --------- REVERSE ---------
            int i = 0, j = n - 1;
            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

            System.out.println("\nReversed Array:");
            for (i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

