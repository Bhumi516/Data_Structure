package LAB3;

import java.util.Scanner;

public class Binary_Search {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in SORTED order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int mid;
        int position = -1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == key) {
                position = mid;
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (position != -1) {
            System.out.println("Element found at position: " + (position + 1));
        } else {
            System.out.println("Element not found");
        }
    }
}
