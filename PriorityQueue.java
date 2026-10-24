import java.util.Comparator;
import java.util.Queue;

// NOTE: this class intentionally keeps its original name and API
// (enqueue / dequeue, highest value first), but the storage is now
// java.util.PriorityQueue (fully qualified below, because this class
// shadows the JDK name). The original sorted the whole list on every
// insert (O(n log n) per insert) and removed index 0 (O(n) shift),
// and its ArrayList was static, so all instances shared one queue.
public class PriorityQueue {

    static class Pair {
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

    // Instance field, not static: instances no longer share a queue.
    private final Queue<Pair> pq;

    public PriorityQueue() {
        // JDK PriorityQueue is a min-heap by default; reverse the
        // comparator so dequeue() returns the highest value first,
        // matching the original descending sort.
        this.pq = new java.util.PriorityQueue<>(
                Comparator.comparingInt(Pair::getValue).reversed());
    }

    // O(log n) insert, instead of O(n log n) sort-on-every-insert.
    public void enqueue(String key, int value) {
        pq.add(new Pair(key, value));
    }

    // O(log n) removal, instead of O(n) remove(0) shift.
    public String dequeue() {
        Pair pair = pq.poll();
        return pair == null ? null : pair.key;
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.enqueue("X", 10);
        pq.enqueue("Y", 1);
        pq.enqueue("Z", 3);
        System.out.print(pq.dequeue());
    }
}
