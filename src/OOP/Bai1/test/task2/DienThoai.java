package OOP.Bai1.test.task2;

public abstract class DienThoai {
    // id, Tên điện thoại, Giá bán, Thời gian bảo hành, Hãng sản xuất
    protected String id;
    protected String tenDienThoai;
    protected double giaBan;
    protected int thoiGianBaoHanh; // tháng
    protected String hangSanXuat;

    public abstract void input(); // nhập thông tin
    public abstract void display(); // hiển thị thông tin
}
