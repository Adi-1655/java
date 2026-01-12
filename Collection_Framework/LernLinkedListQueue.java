import java.util.LinkedList;
import java.util.Queue;

public class LernLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(23);
        queue.offer(11);
        queue.offer(05);
        queue.offer(16);  // offer function is used to insert element in queue

        System.out.println(queue);

        System.out.println(queue.poll()); // poll is used to pull or remove the element out from the queue

        System.out.println(queue);

        System.out.println(queue.peek()); // peek is used to check which element is placed at peek/ at front in queue
        queue.poll();
        System.out.println(queue);

        
    }
}
