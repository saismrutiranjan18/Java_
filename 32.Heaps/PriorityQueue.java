import java.util.*;

public class PriorityQueue {

    static class Student implements Comparable<Student> { // overriding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s) {
            return this.rank - s.rank;
        }
    }

    public static void main(String[] args) {
        java.util.PriorityQueue<Student> pq = new java.util.PriorityQueue<>();
        pq.add(new Student("A", 4)); // O(logn)
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while (!pq.isEmpty()) {
            Student s = pq.peek();
            System.out.println(s.name + " -> " + s.rank); // O(1)
            pq.remove(); // O(logn)
        }
    }
}
