package generic_stack_queue.MyQueu;
import java.util.LinkedList;
import java.util.Queue;

public class Main_Queue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
