package OOP.Bai1.QLPhone.task2;

import java.util.Scanner;

public abstract class DienThoai {
    // id, Tên điện thoại, Giá bán, Thời gian bảo hành, Hãng sản xuất
    protected String id;
    protected String tenDienThoai;
    protected double giaBan;
    protected int thoiGianBaoHanh; // tháng
    protected String hangSanXuat;

    public DienThoai() {
    }

    public DienThoai(String id, String tenDienThoai, double giaBan, int thoiGianBaoHanh, String hangSanXuat) {
        this.id = id;
        this.tenDienThoai = tenDienThoai;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.hangSanXuat = hangSanXuat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void nhapThongTinChung() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ID: ");
        id = sc.nextLine();

        System.out.print("Nhập tên điện thoại: ");
        tenDienThoai = sc.nextLine();

        System.out.print("Nhập giá bán: ");
        giaBan = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập thời gian bảo hành (tháng): ");
        thoiGianBaoHanh = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập hãng sản xuất: ");
        hangSanXuat = sc.nextLine();
    }

    public void xuatThongTin() {
        System.out.println("-------- Thông tin điện thoại ----------");
        System.out.println("ID: " + id);
        System.out.println("Tên điện thoại: " + tenDienThoai);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Thời gian bảo hành: " + thoiGianBaoHanh + " tháng");
        System.out.println("Hãng sản xuất: " + hangSanXuat);
        System.out.println("--------------------------------------");
    }

    public abstract void input();

    public abstract void output();
}
