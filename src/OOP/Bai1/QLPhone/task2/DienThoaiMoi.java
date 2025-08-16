package OOP.Bai1.QLPhone.task2;

import java.util.Scanner;

public class DienThoaiMoi extends DienThoai {
    private int soLuong;

    public DienThoaiMoi() {
    }

    public DienThoaiMoi(String id, String tenDienThoai, double giaBan, int thoiGianBaoHanh, String hangSanXuat, int soLuong) {
        super(id, tenDienThoai, giaBan, thoiGianBaoHanh, hangSanXuat);
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public void input() {
        super.nhapThongTinChung();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng: ");
        this.soLuong = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void output() {
        super.xuatThongTin();
        System.out.println("Số lượng: " + soLuong);
        System.out.println("--------------------------------------");
    }
}
