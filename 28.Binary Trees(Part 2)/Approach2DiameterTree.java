public class Approach2DiameterTree {
    
    static class Node{
        int data;
        Node left, right;

    public Node (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

     //approach 2 to solve this quesiton
     static class Info{
        int diam; 
        int ht;

        public Info(int diam, int ht){
            this.diam = diam; 
            this.ht = ht;
        }
    }

    public static Info diameter2(Node root){ //O(n)
        if(root==null){
            return new Info(0,0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);

        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String[] args){
        /*      1
         *     / \
         *    2    3
         *   / \   / \
         *   4  5  6  7
         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);
        System.out.println();
         System.out.println(diameter2(root).diam +" ");
        }
    }
}
