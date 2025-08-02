package TongQuanOOP.Bai3;

import java.util.Scanner;

public class Point {
    double x;
    double y;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tọa Độ X: ");
        x = sc.nextDouble();
        System.out.println("Nhập Tọa Độ Y: ");
        y = sc.nextDouble();
    }

    double khoangCach (Point p){
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }
}
