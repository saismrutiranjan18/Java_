import java.util.ArrayList;

public class Merge2BST {

    // Node class representing each node in the BST
    static class Node {
        int data;
        Node left, right;

        // Constructor to initialize a node
        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Function to get the inorder traversal of a BST
    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    // Function to create a balanced BST from a sorted ArrayList
    public static Node createBST(ArrayList<Integer> arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid)); // Root is the middle element
        root.left = createBST(arr, start, mid - 1); // Recursively construct the left subtree
        root.right = createBST(arr, mid + 1, end); // Recursively construct the right subtree
        return root;
    }

    // Function to merge two BSTs into a single BST
    public static Node mergeBSTs(Node root1, Node root2) {
        // Step 1: Get inorder traversals of both BSTs
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // Step 2: Merge the two sorted inorder traversals into one sorted list
        int i = 0, j = 0;
        ArrayList<Integer> finalArr = new ArrayList<>();

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            } else {
                finalArr.add(arr2.get(j));
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;
        }

        // Add remaining elements from arr2
        while (j < arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }

        // Step 3: Convert the sorted ArrayList to a balanced BST
        return createBST(finalArr, 0, finalArr.size() - 1);
    }

    // Function for preorder traversal of a BST
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        /*
         * Tree 1:
         *       2
         *      / \
         *     1   4
         */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        /*
         * Tree 2:
         *       9
         *      / \
         *     3  12
         */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        /*
         * Final merged BST:
         *       3
         *      / \
         *     1   9
         *      \  / \
         *       2 4  12
         */

        // Merge the two BSTs and get the root of the merged BST
        Node root = mergeBSTs(root1, root2);

        // Preorder traversal of the merged BST
        System.out.print("Preorder traversal of merged BST: ");
        preorder(root);
    }
}
