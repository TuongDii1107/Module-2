package Constructor.Bai2;

public class ThoiGian {
    private int gio;
    private int phut;
    private int giay;

    public ThoiGian() {
        gio = 0;
        phut = 0;
        giay = 0;
    }

    public ThoiGian(int gio) {
        this.gio = gio;
        this.phut = 0;
        this.giay = 0;
    }

    public ThoiGian(int gio, int phut) {
        this.gio = gio;
        this.phut = phut;
        this.giay = 0;
    }

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public ThoiGian(ThoiGian t) {
        this.gio = t.gio;
        this.phut = t.phut;
        this.giay = t.giay;
    }

    public void xuat() {
        System.out.printf("%02d:%02d:%02d%n", gio, phut, giay);
    }
}
