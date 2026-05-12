package LAB5;

import java.util.Scanner;

public class HashFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size;

        System.out.print("Enter size of hash table: ");
        size = sc.nextInt();

        int[] hashTable = new int[size];

        // Initialize hash table with -1 (empty)
        for (int i = 0; i < size; i++) {
            hashTable[i] = -1;
        }

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Insert elements using hash function
        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            int key = sc.nextInt();

            int index = key % size;   // Hash function

            hashTable[index] = key;
        }

        // Display hash table
        System.out.println("\nHash Table:");
        for (int i = 0; i < size; i++) {

            if (hashTable[i] != -1)
                System.out.println("Index " + i + " : " + hashTable[i]);
            else
                System.out.println("Index " + i + " : Empty");
        }
    }
}
