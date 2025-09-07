package generic_stack_queue;

public class test<E> {
    private int capacity; // kích thước thực tế (không cho người dùng biết)
    private int size;     // số phần tử hiện tại
    private Object[] elementData;
    private Object[] emptyArray = {}; // tái sử dụng nhiều lần

    public test() {
        elementData = emptyArray;
        capacity = 10;
    }

    // Hàm mở rộng capacity
    private void ensureCapacity() {
        if (elementData == emptyArray) {
            capacity = 10;
            elementData = new Object[capacity];
        }
        if (size == capacity) {
            if (capacity == 0) {
                capacity = 1;
            } else if (capacity == 1) {
                capacity = 2;
            } else {
                capacity = (int) (capacity * 1.5);
            }

            Object[] temp = new Object[capacity];
            for (int i = 0; i < elementData.length; i++) {
                temp[i] = elementData[i];
            }
            elementData = temp;
        }
    }

    // a. add(int element): thêm vào cuối
    public void add(int element) {
        ensureCapacity();
        elementData[size] = element;
        size++;
    }

}
