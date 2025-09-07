package generic_stack_queue.MyQueu;

public class MyQueue {

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // a. addFirst(int element)
    public void add(int element) {
        Node nodeNew = new Node(element);
        if (head == null) {
            head = tail = nodeNew;
        } else {
            nodeNew.next = head;
            head = nodeNew;
        }
        size++;
    }
    // f. removeLast()
    public int remove() {
        if (tail == null) throw new RuntimeException("List is empty");
        if (head == tail) {
            int val = head.value;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        while (prev.next != tail) {
            prev = prev.next;
        }
        int val = tail.value;
        tail = prev;
        tail.next = null;
        size--;
        return val;
    }

    // i. getLast()
    public int peek() {
        if (tail == null) throw new RuntimeException("List is empty");
        return tail.value;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    // b. toString()
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            stringBuilder.append(temp.value).append("\t");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }

}
