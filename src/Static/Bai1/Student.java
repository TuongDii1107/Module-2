package Static.Bai1;

/**
 * Viết một lớp Student đại diện cho sinh viên, bao gồm các thông tin sau:
 * <p>
 * Mã số sinh viên
 * Tên
 * Điểm
 * Sử dụng biến tĩnh (static) để đếm số lượng sinh viên đã được tạo ra và viết phương thức tĩnh để
 * truy xuất số lượng sinh viên.
 */
public class Student {
    private String id;
    private String name;
    private double score;

    private static int studentCount = 0; // biến tĩnh

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        studentCount++;
    }


}
