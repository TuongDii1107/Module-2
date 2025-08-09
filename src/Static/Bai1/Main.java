package Static.Bai1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("SV01", "An", 8.5);
        Student s2 = new Student("SV02", "Bình", 7.0);
        Student s3 = new Student("SV03", "Chi", 9.0);

        System.out.println("Số lượng sinh viên: " + Student.getStudentCount());
    }
}
