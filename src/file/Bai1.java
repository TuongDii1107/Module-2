package file;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Bai1 {
    // a. Đọc tất cả dòng trong file và hiển thị trên 1 dòng
    public static void readAllLines(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        String result = String.join(" ", lines);
        System.out.println("Nội dung file (gộp 1 dòng): " + result);
    }

    // b. Đọc đúng 3 dòng đầu tiên
    public static void readThreeLines(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            System.out.println("3 dòng đầu tiên:");
            for (int i = 0; i < 3; i++) {
                String line = br.readLine();
                if (line == null) break;
                System.out.println(line);
            }
        }
    }

    // c. Đếm số lần xuất hiện của một từ (mỗi từ 1 dòng trong file)
    public static void countWord(String filePath, String wordToFind) throws IOException {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals(wordToFind)) {
                    count++;
                }
            }
        }
        System.out.println("Số lần xuất hiện của '" + wordToFind + "': " + count);
    }

    // d. Kiểm tra đường dẫn là file hay thư mục
    public static void checkPath(String path) {
        File f = new File(path);
        if (f.exists()) {
            if (f.isFile()) {
                System.out.println(path + " là file.");
            } else if (f.isDirectory()) {
                System.out.println(path + " là thư mục.");
            }
        } else {
            System.out.println("Đường dẫn không tồn tại.");
        }
    }

    // e. Xóa file hoặc thư mục (chỉ xóa được thư mục rỗng)
    public static void deleteFileOrFolder(String path) {
        File f = new File(path);
        if (f.delete()) {
            System.out.println("Xóa thành công: " + path);
        } else {
            System.out.println("Không thể xóa (thư mục có thể không rỗng): " + path);
        }
    }

    // f. Đổi tên file hoặc thư mục
    public static void renameFileOrFolder(String oldPath, String newPath) {
        File oldFile = new File(oldPath);
        File newFile = new File(newPath);
        if (oldFile.renameTo(newFile)) {
            System.out.println("Đổi tên thành công thành: " + newPath);
        } else {
            System.out.println("Đổi tên thất bại.");
        }
    }

    public static void main(String[] args) {
        String filePath = "src/file/data/input.txt";
        try {
            // a
            readAllLines(filePath);
            // b
            readThreeLines(filePath);
            // c
            countWord(filePath, "hello");
            // d
            checkPath(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
