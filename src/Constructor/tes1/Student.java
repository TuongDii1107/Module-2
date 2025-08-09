package Constructor.tes1;

import java.util.Scanner;

public class Student {
     private String name;
     private int age;
     private String gender;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student(String name){
        this.name = name;
    }

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
