public class SizeofLargestBST {

    // Node class to represent a binary tree node
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Info class to store properties of a subtree
    static class Info {
        boolean isBST; // Whether the subtree is a BST
        int size;      // Size of the subtree
        int min;       // Minimum value in the subtree
        int max;       // Maximum value in the subtree

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0; // To store the size of the largest BST

    // Function to find the largest BST in a binary tree
    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        // Recursively find information for left and right subtrees
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        // Calculate the size, min, and max for the current subtree
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        // Check if the current subtree is a BST
        if (root.data > leftInfo.max && root.data < rightInfo.min && leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, size); // Update the maximum BST size
            return new Info(true, size, min, max);
        }

        // If the current subtree is not a BST
        return new Info(false, size, min, max);
    }

    public static void main(String[] args) {
        /*
         * Binary Tree:
         *       50
         *      /  \
         *    30    60
         *   / \   /  \
         *  5  20 45  70
         *             / \
         *           65  80
         */

        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        /*
         * Largest BST subtree:
         *       60
         *      /  \
         *    45   70
         *         /  \
         *       65   80
         */

        Info info = largestBST(root);
        System.out.println("Largest BST size = " + maxBST);
    }
}
