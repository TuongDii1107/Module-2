package my_linked_list;

public class MyLinkedList {

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
    public void addFirst(int element) {
        Node nodeNew = new Node(element);
        if (head == null) {
            head = tail = nodeNew;
        } else {
            nodeNew.next = head;
            head = nodeNew;
        }
        size++;
    }

    // c. addLast(int element)
    public void addLast(int element) {
        Node nodeNew = new Node(element);
        if (tail == null) {
            head = tail = nodeNew;
        } else {
            tail.next = nodeNew;
            tail = nodeNew;
        }
        size++;
    }

    // d. add(index, element)
    public void add(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            Node nodeNew = new Node(element);
            nodeNew.next = prev.next;
            prev.next = nodeNew;
            size++;
        }
    }

    // e. removeFirst()
    public int removeFirst() {
        if (head == null) throw new RuntimeException("List is empty");
        int val = head.value;
        head = head.next;
        size--;
        if (head == null) tail = null;
        return val;
    }

    // f. removeLast()
    public int removeLast() {
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

    // g. remove(index)
    public int remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index: " + index);
        if (index == 0) return removeFirst();
        if (index == size - 1) return removeLast();

        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    // h. getFirst()
    public int getFirst() {
        if (head == null) throw new RuntimeException("List is empty");
        return head.value;
    }

    // i. getLast()
    public int getLast() {
        if (tail == null) throw new RuntimeException("List is empty");
        return tail.value;
    }

    // j. get(index)
    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index: " + index);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    // k. set(index, element)
    public void set(int index, int element) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index: " + index);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.value = element;
    }

    // l. indexOf(element)
    public int indexOf(int element) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == element) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    // m. lastIndexOf(element)
    public int lastIndexOf(int element) {
        Node current = head;
        int index = 0;
        int lastIndex = -1;
        while (current != null) {
            if (current.value == element) lastIndex = index;
            current = current.next;
            index++;
        }
        return lastIndex;
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
