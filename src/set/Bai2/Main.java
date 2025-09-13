package set.Bai2;

public class Main {
    public static void main(String[] args) {
        String text = "học java rất vui và học java cũng rất bổ ích";
        String[] names = {"An", "Bình", "An", "Lan", "Huy", "Lan", "Mai"};

        // a. Đếm từ trong văn bản
        Map1.demSoLanTu(text);

        System.out.println();

        // b. Kiểm tra tính duy nhất của tên
        Map1.kiemTraTen(names);
    }
}
