package TongQuanOOP.Bai2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vào phân số thứ nhất: ");
        PhanSo ps1 = new PhanSo();
        ps1.input();

        System.out.println("Nhập vào phân số thứ hai: ");
        PhanSo ps2 = new PhanSo();
        ps2.input();

        System.out.print("Phân số thứ nhất: ");
        ps1.output();
        System.out.print("Phân số thứ hai: ");
        ps2.output();

        System.out.println("Tổng: ");
        ps1.cong(ps2).output();
        System.out.println("Hiệu: ");
        ps1.tru(ps2).output();
        System.out.println("Tích: ");
        ps1.tich(ps2).output();
        System.out.println("thương");
        ps1.thuong(ps2).output();

        System.out.println("Phân Số Thứ Nhat: " + (ps1.laPSDuong() ? "dương" : "âm") + ".");
        System.out.println("Phân Số Thứ Hai: " + (ps2.laPSDuong() ? "dương" : "âm") + ".");

        System.out.println("Phân Số Thứ Nhất: " + (ps1.laPSKhong() ? "bằng không" : "không bằng không") + ".");
        System.out.println("Phân Số Thứ Hai: " + (ps1.laPSKhong() ? "bằng không" : "không bằng không") + ".");

    }


}
