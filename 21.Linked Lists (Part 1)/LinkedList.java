public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch (int key) { // O(n)
        int i = 0; 
        Node temp = head;
        while(temp != null) {
            if(temp.data == key){
                return i;
            }
        temp = temp.next;
        i++;
        }
    // key not found
    return -1;
    }


    public int helper(Node head, int key){ // O(n)
        if(head == null){
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
    return helper(head, key);
    }

    public void reverse(){ // O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n) {
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n==sz){
            head = head.next; //remove first
            return;
        }

        //sz-n
        int i = 1;
        int itoFind = sz-n; 
        Node prev = head;
        while (i< itoFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // slow fast approach
    public Node findMid(Node head) { //helper
        Node slow = head; 
        Node fast = head;

        while(fast!= null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        } 
        return slow; // slow is my MidNode
    }

    public boolean checkPalindrome(){
        if(head==null || head.next == null){
            return true;
        }

        //step 1 - find mid
        Node midNode = findMid(head);

        //step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;

        //step 3 - check left half and right half
        while(right!= null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle() { //Floyd's CFA
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;  //+1
            fast = fast.next.next; //+2
            if(slow == fast){
                return true; //cycle exist
            }
        }
        return false; //cycle doesn't exist
    }

    public static void removeCycle(){

        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null; //last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle -> last.next = null
        prev.next = null;
    }
    public static void main(String[] args) {
      head = new Node(1);
      Node temp = new Node(2);
      head.next = temp;
      head.next.next = new Node(3);
      head.next.next.next = temp;

      //1->2->3->1
      System.out.println(isCycle());
      removeCycle();
      System.out.println(isCycle());
    }
}
