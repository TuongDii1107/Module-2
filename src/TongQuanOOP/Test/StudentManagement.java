package TongQuanOOP.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentManagement {
    public static void main(String[] args) {
        //Nhập vào số lượng học sinh
        int n = 2; //sử dụng do while

        ArrayList<Student> students = new ArrayList<>(n);

        Student student;
        for (int i = 1; i <= n; i++) {
            System.out.printf("Nhập thông tin sinh viên thứ %d: ", i);
            student = new Student();
            student.input();
            students.add(student);
        }
        for (int i = 1; i <= n; i++) {
            System.out.printf("\nThông tin sinh viên thứ %d: \n ", i);
            students.get(i - 1).output();
        }

        Student st1 = new Student();
        Student st2 = new Student();

        System.out.print("Nhập thông tin sinh viên thứ 1: ");
        st1.input();
        System.out.print("Nhập thông tin sinh viên thứ 2: ");
        st2.input();

        System.out.print("Thông tin sinh viên thứ 1: ");
        st1.output();
        System.out.print("Thông tin sinh viên thứ 2: ");
        st2.output();

    }
}
