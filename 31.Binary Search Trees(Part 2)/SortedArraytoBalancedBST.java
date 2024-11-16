public class SortedArraytoBalancedBST {

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

    // Create BST from sorted array
    public static Node createBST(int arr[], int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);
        return root;
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 8, 10, 11, 12};

        /* 
         * Expected BST:
         *        8
         *      /   \
         *     5     11
         *    / \   /  \
         *   3   6 10   12
         */

        Node root = createBST(arr, 0, arr.length - 1);
        System.out.println("Pre-order Traversal of the BST:");
        preOrder(root);
    }
}
