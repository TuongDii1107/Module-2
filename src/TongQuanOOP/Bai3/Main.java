package TongQuanOOP.Bai3;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        System.out.println("Nhập Vào Tọa Độ điểm thu 1: ");
        p1.input();
        System.out.println("Nhập Vào Tọa Độ  điểm thứ 2: ");
        p2.input();

        double khoangCach = p1.khoangCach(p2);

        System.out.println("Khoảng cách: " + khoangCach);


    }

}
