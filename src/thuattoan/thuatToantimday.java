package thuattoan;

public class thuatToantimday {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int dem = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                dem++;
                System.out.print("Dãy " + dem + ": [");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    if (k < j) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]"); // xún dòng
            }
        }
        System.out.println("Tổng số dãy con: " + dem);

        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0; // cộng dồn phần tử từ i -> j
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum > max) {// ktra nếu sum > max thì cập nhật lại max
                    max = sum;
                }
            }
        }
        System.out.println("\nTổng lớn nhất = " + max);

        System.out.println("Các dãy con có tổng lớn nhất:");
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == max) {
                    System.out.print("[");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k]);
                        if (k < j) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println("]");
                }
            }
        }
    }
}
