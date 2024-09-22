public class isValidBST {
    static class Node{
        int data; 
        Node left; 
        Node right;

        Node(int data){
            this.data = data;
        }
    }


    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data>val){
            //left Subtree
            root.left = insert(root.left, val);
        }else{
            //right Subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data +" ");
        inorder(root.right);
    }

    public static boolean validBST(Node root, Node min , Node max){
        if(root == null){
            return true;
        }

        if(min!=null && root.data<=min.data){
            return false;
        }

        else if(max!=null && root.data >= max.data){
            return false;
        }

        return validBST(root.left, min, root)  && validBST(root.right, root, max);
    }
    public static void main(String[] args){
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i = 0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        if(validBST(root, null, null)){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }
    }
}
