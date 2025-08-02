package TongQuanOOP.Bai1;

import TongQuanOOP.Test.Student;

import java.util.ArrayList;

/**
 * Viết chương trình cho phép nhập thông tin học sinh,
 * bao gồm: tên học sinh, điểm toán, và điểm văn. Tính điểm trung bình và hiển thị kết quả.
 */
public class main {
    public static void main(String[] args) {
        //Nhập vào số lượng học sinh
        int n = 3; //sử dụng do while

        ArrayList<student> students = new ArrayList<>(n);

        student student;
        for (int i = 1; i <= n; i++) {
            System.out.printf("Nhập thông tin học sinh thứ %d: \n", i);
            student = new student();
            student.input();
            students.add(student);
        }
        for (int i = 1; i <= n; i++) {
            System.out.printf("\nThông tin học sinh thứ %d: \n ", i);
            students.get(i - 1).output();
        }

        student st1 = new student();
        student st2 = new student();
        student st3 = new student();

        System.out.print("\nNhập thông tin học sinh thứ 1:\n ");
        st1.input();
        System.out.print("\nNhập thông tin học sinh thứ 2: \n");
        st2.input();
        System.out.print("\nNhập thông tin học sinh thứ 3: \n");
        st3.input();

        System.out.print("Thông tin học sinh thứ 1: ");
        st1.output();
        System.out.print("Thông tin học sinh thứ 2: ");
        st2.output();
        System.out.print("Thông tin học sinh thứ 3: ");
        st3.output();

    }
}
