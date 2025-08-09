package OOP.Bai1.test;

import java.util.Scanner;

public class person {
    private String name;
    private    int age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào tên: ");
        setName(sc.nextLine());

        System.out.println("Nhập vào tuổi: ");
        setAge(Integer.parseInt(sc.nextLine()));

    }
}
