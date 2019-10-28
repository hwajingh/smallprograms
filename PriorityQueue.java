import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class PriorityQueue {

    static ArrayList<Pair> pq;

    class Pair {
        String key;
        int value;

        public Pair(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    static class itemComparator implements Comparator<Pair>
    {
        public int compare(Pair c1, Pair c2)
        {
            return c2.getValue() - c1.getValue();
        }
    }

    public PriorityQueue() {
        pq = new ArrayList<>();
    }

    public void enqueue(String key, int value) {
        pq.add(new Pair(key, value));
        Collections.sort(pq, new itemComparator());
    }

    public String dequeue() {
        return pq.remove(0).key;
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.enqueue("X", 10);
        pq.enqueue("Y", 1);
        pq.enqueue("Z", 3);
        System.out.print(pq.dequeue());
    }
}

//public class test {
//    static PriorityQueue pq;
//
//    public static void main(String[] args) {
//        pq = new PriorityQueue();
//        pq.enqueue("X", 10);
//        pq.enqueue("Y", 1);
//        pq.enqueue("Z", 3);
//        System.out.print(pq.dequeue());
//    }
//}
