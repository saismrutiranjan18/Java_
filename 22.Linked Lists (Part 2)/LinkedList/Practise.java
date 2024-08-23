package LinkedList;

public class Practise {

        public static class Node{
            int data; 
            Node next;

            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }
            
            public static Node head;
            public static Node tail;

            public void addFirst(int data){
                //create a new node
                Node newNode = new Node (data);

                if(head == null){
                    head = tail = newNode;
                    return;
                }
       
                //node next -> head
                newNode.next = head;

                // new node - head
                head = newNode;
            }

            // method to print the linkedlist
            public void printLL(){
                Node temp = head;
                while(temp !=null){
                    System.out.print(temp.data +"->");
                    temp = temp.next;
                }
                System.out.print("null");
            }

            public void addLast(int data){
                //create a new node
                Node newNode = new Node(data);

                if(head ==null){
                    head = tail = newNode;
                    return;
                }

                //pointing tail to new node
                tail.next = newNode;

                //assign tail to new node
                tail = newNode;
            }
      
    public static void main(String[] args) {
        Practise ll = new Practise();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.printLL();
    }
}
