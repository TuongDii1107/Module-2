package OOP.Bai1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n-- CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI --");
            System.out.println("1. Xem danh sách điện thoại");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Sắp xếp theo giá");
            System.out.println("6. Tìm kiếm");
            System.out.println("7. Tính tổng tiền");
            System.out.println("8. Giảm giá cho điện thoại cũ");
            System.out.println("9. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int sub1;
                    do {
                        System.out.println("\n1. Xem tất cả");
                        System.out.println("2. Xem điện thoại cũ");
                        System.out.println("3. Xem điện thoại mới");
                        System.out.println("4. Trở về menu chính");
                        sub1 = sc.nextInt();
                    } while (sub1 != 4);
                    break;

                case 2:
                    int sub2;
                    do {
                        System.out.println("\n1. Thêm mới điện thoại cũ");
                        System.out.println("2. Thêm mới điện thoại mới");
                        System.out.println("3. Trở về menu chính");
                        sub2 = sc.nextInt();
                    } while (sub2 != 3);
                    break;

                case 5:
                    int sub5;
                    do {
                        System.out.println("\n1. Tăng dần");
                        System.out.println("2. Giảm dần");
                        System.out.println("3. Trở về menu chính");
                        sub5 = sc.nextInt();
                    } while (sub5 != 3);
                    break;

                case 6:
                    int sub6;
                    do {
                        System.out.println("\n1. Tìm kiếm tất cả điện thoại");
                        System.out.println("2. Tìm kiếm điện thoại cũ");
                        System.out.println("3. Tìm kiếm điện thoại mới");
                        System.out.println("4. Trở về menu chính");
                        sub6 = sc.nextInt();

                        if (sub6 >= 1 && sub6 <= 3) {
                            int subSearch;
                            do {
                                System.out.println("\n1. Tìm kiếm theo giá");
                                System.out.println("2. Tìm kiếm theo tên");
                                System.out.println("3. Tìm kiếm theo hãng");
                                System.out.println("4. Trở về menu Tìm kiếm");
                                subSearch = sc.nextInt();
                            } while (subSearch != 4);
                        }

                    } while (sub6 != 4);
                    break;
            }
        } while (choice != 9);

        System.out.println("Chương trình kết thúc.");
    }
}
