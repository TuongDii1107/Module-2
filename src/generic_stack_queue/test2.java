package generic_stack_queue;

public class test2<E> {

    private class Node {
        E value;
        Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // a. addFirst(int element)
    public void addFirst(E element) {
        Node nodeNew = new Node(element);
        if (head == null) {
            head = tail = nodeNew;
        } else {
            nodeNew.next = head;
            head = nodeNew;
        }
        size++;
    }
}
