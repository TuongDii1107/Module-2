package generic_stack_queue;

public class Main2 {
    public static void main(String[] args) {
        test2<String> myLinkedList = new test2<>();

        // Test addFirst
        myLinkedList.addFirst("10");
        myLinkedList.addFirst("20");
        myLinkedList.addFirst("30");
        System.out.println("Sau addFirst 30, 20, 10:");

        System.out.println(myLinkedList);
    }
}
