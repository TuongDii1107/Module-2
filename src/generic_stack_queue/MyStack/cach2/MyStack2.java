package generic_stack_queue.MyStack.cach2;

public class MyStack2 {
    private int capacity; // kích thước thực tế (không cho người dùng biết)
    private int size;     // số phần tử hiện tại
    private int[] elementData;
    private int[] emptyArray = {}; // tái sử dụng nhiều lần

    public MyStack2() {
        elementData = emptyArray;
        capacity = 10;
    }

    // Hàm mở rộng capacity
    private void ensureCapacity() {
        if (elementData == emptyArray) {
            capacity = 10;
            elementData = new int[capacity];
        }
        if (size == capacity) {
            if (capacity == 0) {
                capacity = 1;
            } else if (capacity == 1) {
                capacity = 2;
            } else {
                capacity = (int) (capacity * 1.5);
            }

            int[] temp = new int[capacity];
            for (int i = 0; i < elementData.length; i++) {
                temp[i] = elementData[i];
            }
            elementData = temp;
        }

    }

    // a. push(): thêm phần tử vào cuối (đỉnh stack)
    public void push(int element) {
        ensureCapacity();
        elementData[size] = element;
        size++;
    }

    // b. peek(): xem phần tử trên đỉnh stack (không xóa)
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack rỗng!");
        }
        return elementData[size - 1];
    }

    // c. pop(): lấy ra và xóa phần tử trên đỉnh stack
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack rỗng!");
        }
        int value = elementData[size - 1];
        size--;
        return value;
    }

    // d. isEmpty(): kiểm tra rỗng
    public boolean isEmpty() {
        return size == 0;
    }

    // e. size(): trả về số lượng phần tử
    public int size() {
        return size;
    }
}


