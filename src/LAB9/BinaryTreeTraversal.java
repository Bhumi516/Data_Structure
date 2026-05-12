package LAB9;
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTreeTraversal {
    // Infix / Inorder Traversal
    static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Prefix / Preorder Traversal
    static void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postfix / Postorder Traversal
    static void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \
            4   5
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Infix (Inorder) Traversal:");
        inorder(root);

        System.out.println("\nPrefix (Preorder) Traversal:");
        preorder(root);

        System.out.println("\nPostfix (Postorder) Traversal:");
        postorder(root);
    }
}
