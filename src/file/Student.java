package file;

import java.util.Objects;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private  double score;

    public Student() {
    }

    public Student(int id, String name, double diem) {
        this.id = id;
        this.name = name;
        this.score = diem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào id: ");
        id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập vào tên: ");
        name = sc.nextLine();

        System.out.print("Nhập vào điểm : ");
        score = Double.parseDouble(sc.nextLine());

    }
    void output(){
        System.out.println("ID: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Điểm: " + score);
    }

    public String toString (){
        return String.format("%s, %s, %s", id, name, score);
   }
}
