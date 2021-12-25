import java.util.PriorityQueue;

/**
 * @author zy
 * @create 2021-08-23 10:39
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        minheap.add(10);
        minheap.add(8);
        minheap.add(9);
        minheap.add(11);
        minheap.add(2);
        System.out.println(minheap.toString());
        System.out.println(minheap.peek());
        minheap.poll();
        System.out.println(minheap.size());
        while (!minheap.isEmpty()){
            System.out.println(minheap.poll());
        }
    }
}
