package TongQuanOOP.Bai1;

import java.util.Scanner;

/**
 * Viết chương trình cho phép nhập thông tin học sinh,
 * bao gồm: tên học sinh, điểm toán, và điểm văn. Tính điểm trung bình và hiển thị kết quả.
 */
public class student {
    String name;
    double mathScore;
    double literatureScore;


    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào tên: ");
        name = sc.nextLine();

        System.out.print("Nhập vào điểm Toán: ");
        mathScore = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập vào điểm Văn: ");
        literatureScore = Double.parseDouble(sc.nextLine());
    }

    double diemTrungBinh() {
        return (mathScore + literatureScore) / 2;
    }

    void output() {
        System.out.println("Tên: \n" + name);
        System.out.print("Điểm Toán:\n" + mathScore);
        System.out.print("\nĐiểm Văn: \n" + literatureScore);
    }

}
