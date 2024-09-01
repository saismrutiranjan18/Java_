import java.util.Stack;

public class QueueUsing2Stack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty() {
        return s1.isEmpty();
    }

    // add - O(n)
    public static void add(int data) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // remove - O(1)
    public static int remove() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        return s1.pop();
    }

    // peek - O(1)
    public static int peek() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        return s1.peek();  // s1 should be used here, not s2
    }

    public static void main(String[] args) {
        QueueUsing2Stack q = new QueueUsing2Stack();  // Use QueueUsing2Stack instead of Queue
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
