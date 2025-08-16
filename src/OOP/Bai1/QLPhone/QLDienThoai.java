package OOP.Bai1.QLPhone;

import OOP.Bai1.QLPhone.task2.DienThoaiCu;
import OOP.Bai1.QLPhone.task2.DienThoaiMoi;

import java.util.ArrayList;
import java.util.Scanner;

public class QLDienThoai {
    static ArrayList<DienThoaiCu> oldPhones = new ArrayList<>();
    static ArrayList<DienThoaiMoi> newPhones = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static {
        oldPhones.add(new DienThoaiCu("DTC001", "Nokia 1280", 500000, 6, "Nokia", 80, "Dùng tốt"));
        oldPhones.add(new DienThoaiCu("DTC002", "Samsung Galaxy S6", 1500000, 12, "Samsung", 75, "Pin yếu"));
        newPhones.add(new DienThoaiMoi("DTM001", "iPhone 15", 25000000, 24, "Apple", 100));
        newPhones.add(new DienThoaiMoi("DTM002", "IPhone 16", 36000000, 12, "Apple", 50));
    }

    public static void main(String[] args) {
        menuChinh();
    }

    static void menuChinh() {
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

            choice = getChoice(1, 9, "Chọn chức năng: ");

            switch (choice) {
                case 1 -> menuXemDanhSach();
                case 2 -> menuThemMoi();
                case 5 -> menuSapXep();
                case 6 -> menuTimKiem();
                case 9 -> System.out.println("Chương trình kết thúc.");
                default -> System.out.println("(Chức năng này chưa làm)");
            }
        } while (choice != 9);
    }

    private static void capNhat() {
        System.out.print("Nhập vào mã muốn cập nhật: ");
        String id = sc.nextLine();

        boolean isExistPhone = false;

        if (id.startsWith("DTC")) { // Điện thoại cũ
            for (DienThoaiCu oldPhone : oldPhones) {
                if (oldPhone.getId().equals(id)) {
                    isExistPhone = true;
                    System.out.printf("Bạn có muốn cập nhật điện thoại cũ có mã %s không?\n", id);
                    System.out.println("Chọn Yes để xác nhận, No để hủy");
                    if ("yes".equalsIgnoreCase(sc.nextLine())) {
                        oldPhone.input(); // nhập lại dữ liệu
                        System.out.println("Cập nhật thành công!");
                    } else {
                        System.out.println("Đã hủy cập nhật!");
                    }
                    break;
                }
            }
        } else if (id.startsWith("DTM")) { // Điện thoại mới
            for (DienThoaiMoi newPhone : newPhones) {
                if (newPhone.getId().equals(id)) {
                    isExistPhone = true;
                    System.out.printf("Bạn có muốn cập nhật điện thoại mới có mã %s không?\n", id);
                    System.out.println("Chọn Yes để xác nhận, No để hủy");
                    if ("yes".equalsIgnoreCase(sc.nextLine())) {
                        newPhone.input(); // nhập lại dữ liệu
                        System.out.println("Cập nhật thành công!");
                    } else {
                        System.out.println("Đã hủy cập nhật!");
                    }
                    break;
                }
            }
        } else {
            System.out.println("Mã không hợp lệ! (Phải bắt đầu bằng DTC hoặc DTM)");
            return;
        }

        if (!isExistPhone) {
            System.out.println("Không tìm thấy mã muốn cập nhật!");
        }
    }

    private static void delete() {
        System.out.print("Nhập vào mã muốn xóa: ");
        String id = sc.nextLine();

        boolean isExistPhone = false;

        if (id.startsWith("DTC")) { // Điện thoại cũ
            for (DienThoaiCu oldPhone : oldPhones) {
                if (oldPhone.getId().equals(id)) {
                    isExistPhone = true;
                    System.out.printf("Bạn có muốn xóa điện thoại cũ có mã %s không?\n", id);
                    System.out.println("Chọn Yes để xác nhận, No để hủy");
                    if ("yes".equalsIgnoreCase(sc.nextLine())) {
                        oldPhones.remove(oldPhone);
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Đã hủy việc xóa!");
                    }
                    break;
                }
            }
        } else if (id.startsWith("DTM")) { // Điện thoại mới
            for (DienThoaiMoi newPhone : newPhones) {
                if (newPhone.getId().equals(id)) {
                    isExistPhone = true;
                    System.out.printf("Bạn có muốn xóa điện thoại mới có mã %s không?\n", id);
                    System.out.println("Chọn Yes để xác nhận, No để hủy");
                    if ("yes".equalsIgnoreCase(sc.nextLine())) {
                        newPhones.remove(newPhone);
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Đã hủy việc xóa!");
                    }
                    break;
                }
            }
        } else {
            System.out.println("Mã không hợp lệ! (Phải bắt đầu bằng DTC hoặc DTM)");
            return;
        }

        if (!isExistPhone) {
            System.out.println("Không tìm thấy mã muốn xóa!");
        }
    }

    static void menuXemDanhSach() {
        int choice;
        do {
            System.out.println("\n-- XEM DANH SÁCH --");
            System.out.println("1. Xem tất cả");
            System.out.println("2. Xem điện thoại cũ");
            System.out.println("3. Xem điện thoại mới");
            System.out.println("4. Trở về menu chính");

            choice = getChoice(1, 4, "Chọn: ");
        } while (choice != 4);
    }

    static void menuThemMoi() {
        int choice;
        do {
            System.out.println("\n-- THÊM MỚI --");
            System.out.println("1. Thêm mới điện thoại cũ");
            System.out.println("2. Thêm mới điện thoại mới");
            System.out.println("3. Trở về menu chính");

            choice = getChoice(1, 3, "Chọn: ");
        } while (choice != 3);
    }

    static void menuSapXep() {
        int choice;
        do {
            System.out.println("\n-- SẮP XẾP THEO GIÁ --");
            System.out.println("1. Tăng dần");
            System.out.println("2. Giảm dần");
            System.out.println("3. Trở về menu chính");

            choice = getChoice(1, 3, "Chọn: ");
        } while (choice != 3);
    }

    static void menuTimKiem() {
        int choice;
        do {
            System.out.println("\n-- TÌM KIẾM --");
            System.out.println("1. Tìm tất cả điện thoại");
            System.out.println("2. Tìm điện thoại cũ");
            System.out.println("3. Tìm điện thoại mới");
            System.out.println("4. Trở về menu chính");

            choice = getChoice(1, 4, "Chọn: ");

            if (choice >= 1 && choice <= 3) {
                menuTimKiemChiTiet();
            }
        } while (choice != 4);
    }

    static void menuTimKiemChiTiet() {
        int choice;
        do {
            System.out.println("\n-- TÌM KIẾM CHI TIẾT --");
            System.out.println("1. Theo giá");
            System.out.println("2. Theo tên");
            System.out.println("3. Theo hãng");
            System.out.println("4. Trở về menu Tìm kiếm");

            choice = getChoice(1, 4, "Chọn: ");
        } while (choice != 4);
    }


    static int getChoice(int min, int max, String message) {
        int choice;
        while (true) {
            try {
                System.out.print(message);
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= min && choice <= max) {
                    return choice;
                }
                System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập từ " + min + " đến " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên!");
            }
        }
    }


}
