package generic_stack_queue.MyStack.cach2;

public class Main4 {
    public static void main(String[] args) {
        MyStack2 stack2 = new MyStack2();

        // a. add(element)
        stack2.push(10);
        stack2.push(20);
        stack2.push(30);
        stack2.push(40);
        stack2.push(50);
        System.out.println("Danh sách sau khi add: " + stack2);

        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.peek());
        System.out.println(stack2.peek());

        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
    }
}
