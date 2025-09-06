package OOP.Bai1.QLPhone.task2;

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
            System.out.println("\n-- QUẢN LÝ ĐIỆN THOẠI --");
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
                case 1 -> xemDanhSach();
                case 2 -> themMoi();
                case 3 -> capNhat();
                case 4 -> xoa();
                case 5 -> sapXepTheoGia();
                case 6 -> timKiem();
                case 7 -> tinhTongTien();
                case 8 -> giamGiaDienThoaiCu();
                case 9 -> System.out.println("Kết thúc chương trình.");
            }
        } while (choice != 9);
    }

    // ======= Menu chức năng =======
    static void xemDanhSach() {
        System.out.println("\n-- DANH SÁCH ĐIỆN THOẠI --");
        for (DienThoaiCu dtc : oldPhones) dtc.output();
        for (DienThoaiMoi dtm : newPhones) dtm.output();
    }

    static void themMoi() {
        System.out.println("1. Thêm điện thoại cũ");
        System.out.println("2. Thêm điện thoại mới");
        int chon = getChoice(1, 2, "Chọn: ");
        if (chon == 1) {
            DienThoaiCu dt = new DienThoaiCu();
            dt.input();
            oldPhones.add(dt);
        } else {
            DienThoaiMoi dt = new DienThoaiMoi();
            dt.input();
            newPhones.add(dt);
        }
        System.out.println("Đã thêm thành công!");
    }

    static void capNhat() {
        System.out.print("Nhập ID muốn cập nhật: ");
        String id = sc.nextLine();
        boolean found = false;
        if (id.startsWith("DTC")) {
            for (DienThoaiCu dt : oldPhones) {
                if (dt.getId().equals(id)) {
                    dt.input();
                    found = true;
                    break;
                }
            }
        } else if (id.startsWith("DTM")) {
            for (DienThoaiMoi dt : newPhones) {
                if (dt.getId().equals(id)) {
                    dt.input();
                    found = true;
                    break;
                }
            }
        }
        if (!found) System.out.println("Không tìm thấy ID!");
        else System.out.println("Cập nhật thành công!");
    }

    static void xoa() {
        System.out.print("Nhập ID muốn xóa: ");
        String id = sc.nextLine();
        boolean found = false;
        if (id.startsWith("DTC")) {
            for (int i = 0; i < oldPhones.size(); i++) {
                if (oldPhones.get(i).getId().equals(id)) {
                    oldPhones.remove(i);
                    found = true;
                    break;
                }
            }
        } else if (id.startsWith("DTM")) {
            for (int i = 0; i < newPhones.size(); i++) {
                if (newPhones.get(i).getId().equals(id)) {
                    newPhones.remove(i);
                    found = true;
                    break;
                }
            }
        }
        if (!found) System.out.println("Không tìm thấy ID!");
        else System.out.println("Xóa thành công!");
    }

    static void sapXepTheoGia() {
        ArrayList<DienThoai> all = new ArrayList<>();
        all.addAll(oldPhones);
        all.addAll(newPhones);

        // Interchange sort tăng dần
        for (int i = 0; i < all.size() - 1; i++) {
            for (int j = i + 1; j < all.size(); j++) {
                if (all.get(i).tinhTongGia() > all.get(j).tinhTongGia()) {
                    DienThoai tmp = all.get(i);
                    all.set(i, all.get(j));
                    all.set(j, tmp);
                }
            }
        }

        System.out.println("-- Danh sách sắp xếp theo giá tăng dần --");
        for (DienThoai dt : all) dt.output();
    }

    static void timKiem() {
        System.out.println("1. Tìm tất cả");
        System.out.println("2. Tìm điện thoại cũ");
        System.out.println("3. Tìm điện thoại mới");
        int chon = getChoice(1, 3, "Chọn: ");

        ArrayList<DienThoai> list = new ArrayList<>();
        if (chon == 1) {
            list.addAll(oldPhones);
            list.addAll(newPhones);
        } else if (chon == 2) list.addAll(oldPhones);
        else list.addAll(newPhones);

        System.out.println("1. Theo tên");
        System.out.println("2. Theo hãng");
        System.out.println("3. Theo khoảng giá");
        int chonLoai = getChoice(1, 3, "Chọn kiểu tìm kiếm: ");

        switch (chonLoai) {
            case 1 -> {
                System.out.print("Nhập tên cần tìm: ");
                String key = sc.nextLine().toLowerCase();
                for (DienThoai dt : list) if (dt.getTenDienThoai().toLowerCase().contains(key)) dt.output();
            }
            case 2 -> {
                System.out.print("Nhập hãng cần tìm: ");
                String key = sc.nextLine().toLowerCase();
                for (DienThoai dt : list) if (dt.getHangSanXuat().toLowerCase().contains(key)) dt.output();
            }
            case 3 -> {
                System.out.print("Nhập giá min: "); double min = Double.parseDouble(sc.nextLine());
                System.out.print("Nhập giá max: "); double max = Double.parseDouble(sc.nextLine());
                for (DienThoai dt : list) if (dt.tinhTongGia() >= min && dt.tinhTongGia() <= max) dt.output();
            }
        }
    }

    static void tinhTongTien() {
        double tong = 0;
        for (DienThoai dt : oldPhones) tong += dt.tinhTongGia();
        for (DienThoai dt : newPhones) tong += dt.tinhTongGia();
        System.out.printf("Tổng tiền tất cả điện thoại: %.0f VND\n", tong);
    }

    static void giamGiaDienThoaiCu() {
        System.out.print("Nhập % giảm giá cho điện thoại cũ: ");
        double phanTram = Double.parseDouble(sc.nextLine());
        for (DienThoaiCu dt : oldPhones) dt.khuyenMai(phanTram);
        System.out.println("Đã áp dụng giảm giá cho điện thoại cũ.");
    }

    static int getChoice(int min, int max, String msg) {
        int choice;
        while (true) {
            try {
                System.out.print(msg);
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= min && choice <= max) return choice;
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
            }
        }
    }
}
