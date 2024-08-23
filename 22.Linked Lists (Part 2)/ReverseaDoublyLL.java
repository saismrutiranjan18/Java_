import java.util.*;

public class ReverseaDoublyLL {

    public static class Node {
        int data;
        Node next;
        Node prev; // Add the 'prev' field

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null; // Initialize 'prev' field
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public ReverseaDoublyLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node curr = head; 
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        ReverseaDoublyLL dll = new ReverseaDoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print(); // Output: 1 2 3
        dll.reverse();
        dll.print(); // Output: 3 2 1
    }
}
