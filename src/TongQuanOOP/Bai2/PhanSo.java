package TongQuanOOP.Bai2;

import java.util.Scanner;

public class PhanSo {
    int tu;
    int mau;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào tử số: ");
        tu = Integer.parseInt(sc.nextLine());

        do{
            System.out.print("Mẫu số khác 0: ");
            mau = Integer.parseInt(sc.nextLine());
            if(mau == 0){
                System.out.print("Mẫu không được bằng 0!, vui lòng nhập lại");
            }
        } while (mau == 0);
    }

    void output(){
        rutGon();
        if(mau == 1){
            System.out.println(tu);
        } else {
            System.out.println(tu + "/" + mau);
        }
    }

    void rutGon(){
        if(mau < 0){
            tu = -tu;
            mau = -mau;
        }
        int Ucln = UCLN(Math.abs(tu), Math.abs(mau));
        tu /= Ucln;
        mau /= Ucln;
    }

    int UCLN(int a, int b){
        return  b == 0 ? a : UCLN(b, a % b);
    }

    PhanSo cong(PhanSo ps) {
        PhanSo kq = new PhanSo();
        kq.tu = this.tu * ps.mau + ps.tu * this.mau;// quy đồng
        kq.mau = this.mau * ps.mau;
        kq.rutGon();
        return kq;
    }

    PhanSo tru(PhanSo ps) {
        PhanSo kq = new PhanSo();
        kq.tu = this.tu * ps.mau - ps.tu * this.mau;
        kq.mau = this.mau * ps.mau;
        kq.rutGon();
        return kq;
    }

    PhanSo tich (PhanSo ps) {
        PhanSo kq = new PhanSo();
        kq.tu = ps.tu * this.tu;
        kq.mau = ps.mau * this.mau;
        kq.rutGon();
        return kq;
    }

    PhanSo thuong (PhanSo ps) {
        PhanSo kq = new PhanSo();
        kq.tu = ps.tu * this.mau;
        kq.mau = ps.mau * this.tu;
        kq.rutGon();
        return kq;
    }

    boolean laPSDuong(){
        return tu * mau > 0 || tu == 0;
    }
    boolean laPSKhong(){
        return tu == 0;
    }

}
