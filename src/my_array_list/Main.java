package my_array_list;

public class Main {
    public static void main(String[] args) {
        Bai1 myArrayList = new Bai1();

        // a. add(element)
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);
        System.out.println("Danh sách sau khi add: " + myArrayList);

        // c. add(index, element)
        myArrayList.add(2, 25); // chèn 25 vào vị trí index=2
        System.out.println("Sau khi add(2,25): " + myArrayList);

        // d. set(index, element)
        myArrayList.set(3, 35); // thay giá trị tại index=3 thành 35
        System.out.println("Sau khi set(3,35): " + myArrayList);

        // e. get(index)
        System.out.println("get(4) = " + myArrayList.get(4));

        // f. indexOf(element)
        System.out.println("indexOf(25) = " + myArrayList.indexOf(25));

        // g. lastIndexOf(element)
        myArrayList.add(50);
        myArrayList.add(50);
        System.out.println("Danh sách hiện tại: " + myArrayList);
        System.out.println("lastIndexOf(50) = " + myArrayList.lastIndexOf(50));

        // h. remove(index)
        myArrayList.remove(2); // xóa phần tử tại index=2
        System.out.println("Sau khi remove(2): " + myArrayList);

        // i. removeElement(element)
        myArrayList.removeElement(50); // xóa tất cả phần tử có giá trị = 50
        System.out.println("Sau khi removeElement(50): " + myArrayList);

        // size()
        System.out.println("Số phần tử hiện tại: " + myArrayList.size());
    }
}
