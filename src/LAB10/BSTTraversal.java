package LAB10;

import java.util.Scanner;

class BSTNode {
    int data;
    BSTNode left, right;

    BSTNode(int value) {
        data = value;
        left = right = null;
    }
}

public class BSTTraversal {

    static BSTNode root = null;

    // Insert node in BST
    static BSTNode insert(BSTNode root, int value) {

        if (root == null) {
            root = new BSTNode(value);
            return root;
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Inorder Traversal: Left Root Right
    static void inorder(BSTNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Preorder Traversal: Root Left Right
    static void preorder(BSTNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder Traversal: Left Right Root
    static void postorder(BSTNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            root = insert(root, value);
        }

        System.out.println("\nInorder Traversal:");
        inorder(root);

        System.out.println("\nPreorder Traversal:");
        preorder(root);

        System.out.println("\nPostorder Traversal:");
        postorder(root);
    }
}