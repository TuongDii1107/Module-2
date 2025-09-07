package generic_stack_queue.MyStack.cach1;

public class Main3 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        // a. add(element)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Danh sách sau khi add: " + stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
