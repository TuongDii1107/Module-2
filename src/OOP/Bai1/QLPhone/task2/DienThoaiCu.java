package OOP.Bai1.QLPhone.task2;

import java.util.Scanner;

public class DienThoaiCu extends DienThoai implements KhuyenMai {
    private int phanTramPin;
    private String moTaThem;

    public DienThoaiCu() {
    }

    public DienThoaiCu(String id, String tenDienThoai, double giaBan, int thoiGianBaoHanh, String hangSanXuat, int phanTramPin, String moTaThem) {
        super(id, tenDienThoai, giaBan, thoiGianBaoHanh, hangSanXuat);
        this.phanTramPin = phanTramPin;
        this.moTaThem = moTaThem;
    }

    public int getPhanTramPin() {
        return phanTramPin;
    }

    public void setPhanTramPin(int phanTramPin) {
        this.phanTramPin = phanTramPin;
    }

    public String getMoTaThem() {
        return moTaThem;
    }

    public void setMoTaThem(String moTaThem) {
        this.moTaThem = moTaThem;
    }

    @Override
    public void input() {
        super.nhapThongTinChung();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập phần trăm Pin: ");
        this.phanTramPin = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập mô tả thêm: ");
        this.moTaThem = sc.nextLine();
    }

    @Override
    public void output() {
        super.xuatThongTin();
        System.out.println("Phần trăm Pin: " + phanTramPin + "%");
        System.out.println("Mô tả thêm: " + moTaThem);
        System.out.println("--------------------------------------");
    }
    @Override
    public double tinhTongGia() {
        return giaBan;
    }

    // ====== Giảm giá theo phần trăm ======
    @Override
    public void khuyenMai(double phanTram) {
        giaBan = giaBan * (1 - phanTram / 100);
    }
}
