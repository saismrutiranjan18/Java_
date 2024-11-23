public class AVLTree{

    // Node class to represent an AVL tree node
    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1; // Height of a new node is 1
        }
    }

    public static Node root;

    // Utility method to get the height of a node
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    // Perform a right rotation on a subtree rooted with y
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return the new root
        return x;
    }

    // Perform a left rotation on a subtree rooted with x
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return the new root
        return y;
    }

    // Get the balance factor of a node
    public static int getBalance(Node root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    // Insert a new key into the AVL tree and return the updated root
    public static Node insert(Node root, int key) {
        // Step 1: Perform normal BST insertion
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root; // Duplicate keys are not allowed
        }

        // Step 2: Update the height of the current node
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // Step 3: Get the balance factor of this node to check if it is unbalanced
        int balance = getBalance(root);

        // Step 4: Balance the tree if needed
        // Left Left Case
        if (balance > 1 && key < root.left.data) {
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && key > root.right.data) {
            return leftRotate(root);
        }

        // Left Right Case
        if (balance > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Case
        if (balance < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        // Return the root (unchanged if the tree is balanced)
        return root;
    }

    // Preorder traversal of the AVL tree
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Main method to test the AVL tree implementation
    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        /*
         * AVL Tree structure after insertions:
         *        30
         *       /  \
         *     20    40
         *    / \      \
         *  10  25      50
         */

        System.out.println("Preorder traversal of the constructed AVL tree:");
        preorder(root);
    }
}
