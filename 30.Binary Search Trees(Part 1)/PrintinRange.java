public class PrintinRange {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert a node into the BST
    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    // Inorder traversal of the BST
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        // Only recurse to the left subtree if current node data is greater than k1
        if (root.data >= k1) {
            printInRange(root.left, k1, k2);
        }

        // Print the current node if it is within the range
        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + " ");
        }

        // Only recurse to the right subtree if current node data is less than k2
        if (root.data <= k2) {
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        // Build the BST by inserting values
        for (int value : values) {
            root = insert(root, value);
        }

        // Perform inorder traversal
        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();

        // Print nodes in the range [5, 12]
        System.out.print("Nodes in range [5, 12]: ");
        printInRange(root, 5, 12);
    }
}
