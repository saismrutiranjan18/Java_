import java.util.ArrayList;

public class ConvertBSTtoBalancedBST {
    // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor for Node
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Pre-order traversal
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Balance a BST
    public static Node balanceBST(Node root) {
        // Get inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        // Convert sorted inorder sequence to balanced BST
        root = createBST(inorder, 0, inorder.size() - 1);
        return root;
    }

    // Get inorder traversal
    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    // Create BST from sorted ArrayList
    public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid - 1);
        root.right = createBST(inorder, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        /* 
         * Unbalanced BST:
         *        8
         *      /   \
         *     6     10
         *    /        \
         *   5          11
         *  /             \ 
         *  3              12   
         */
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        // Balance the BST
        root = balanceBST(root);

        /* 
         * Balanced BST:
         *        8
         *      /   \
         *     5     11
         *    / \   /  \
         *   3   6 10   12
         */

        System.out.println("Pre-order Traversal of the Balanced BST:");
        preOrder(root);
    }
}
