package my_array_list;

public class Bai1 {
    private int capacity; // kích thước thực tế (không cho người dùng biết)
    private int size;     // số phần tử hiện tại
    private int[] elementData;
    private int[] emptyArray = {}; // tái sử dụng nhiều lần

    public Bai1() {
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

    // a. add(int element): thêm vào cuối
    public void add(int element) {
        ensureCapacity();
        elementData[size] = element;
        size++;
    }

    // c. add(int index, int element): thêm vào vị trí index
    public void add(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index không hợp lệ!");
        }
        ensureCapacity();
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = element;
        size++;
    }

    // d. set(int index, int element): thay thế phần tử
    public void set(int index, int element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index không hợp lệ!");
        }
        elementData[index] = element;
    }

    // e. get(int index): trả về phần tử
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index không hợp lệ!");
        }
        return elementData[index];
    }

    // f. indexOf(int element): vị trí xuất hiện đầu tiên
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // g. lastIndexOf(int element): vị trí xuất hiện cuối cùng
    public int lastIndexOf(int element) {
        for (int i = size - 1; i >= 0; i--) {
            if (elementData[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // h. remove(int index): xóa phần tử tại index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index không hợp lệ!");
        }
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }

    // i. removeElement(int element): xóa tất cả phần tử có giá trị element
    public void removeElement(int element) {
        int newSize = 0;
        for (int i = 0; i < size; i++) {
            if (elementData[i] != element) {
                elementData[newSize++] = elementData[i];
            }
        }
        size = newSize;
    }

    // lấy số phần tử hiện tại
    public int size() {
        return size;
    }

    // b. toString(): in danh sách
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(elementData[i]).append("\t");
        }
        return stringBuilder.toString();
    }
}
