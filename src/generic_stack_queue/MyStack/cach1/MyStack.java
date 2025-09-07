package generic_stack_queue.MyStack.cach1;

public class MyStack {

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
    public void push(int element) {
        Node nodeNew = new Node(element);
        if (head == null) {
            head = tail = nodeNew;
        } else {
            nodeNew.next = head;
            head = nodeNew;
        }
        size++;
    }

    // e. removeFirst()
    public int pop() {
        if (head == null) throw new RuntimeException("List is empty");
        int val = head.value;
        head = head.next;
        size--;
        if (head == null) tail = null;
        return val;
    }


    // h. getFirst()
    public int peek() {
        if (head == null) throw new RuntimeException("List is empty");
        return head.value;
    }

    public boolean isEmpty(){
        return size == 0;
    }



}
