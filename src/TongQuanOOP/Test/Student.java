package TongQuanOOP.Test;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    String gender;

    void  run(){
        System.out.println(name + "Có thể chạy nhanh !!!");
    }

    void input (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào tên: ");
        name = sc.nextLine();

        System.out.println("Nhập vào tuổi: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập vào giới tính: ");
        gender = sc.nextLine();
    }
    void output(){
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới Tính: " + gender);
    }
}
