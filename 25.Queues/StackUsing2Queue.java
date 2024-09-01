import java.util.*;

public class StackUsing2Queue {
    static class stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }
            int top = -1;

            // Case 1: q1 is the main queue
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else { // Case 2: q2 is the main queue
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }
            int top = -1;

            // Case 1: q1 is the main queue
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                    if (q1.isEmpty()) {
                        break;
                    }
                }
            } else { // Case 2: q2 is the main queue
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                    if (q2.isEmpty()) {
                        break;
                    }
                }
            }
            return top;
        }
    }

    public static void main(String[] args) {
        stack s = new stack(); // Use stack class directly
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}