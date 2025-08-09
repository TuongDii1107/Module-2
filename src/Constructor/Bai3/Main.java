package Constructor.Bai3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Nguyen Van A ", 9);

        System.out.println("Id: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Score: " + student.getScore());

        student.setName("A");
        student.setScore(10);
        System.out.println("Sau khi cập nhật: ");
        System.out.printf("Id: " + student.getId());
        System.out.printf("\nName: " + student.getName());
        System.out.printf("\nScore: " + student.getScore());

        student.setName(" ");
        student.setScore(12);

    }
}
