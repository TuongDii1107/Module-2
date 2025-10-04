package thuattoan;

public class DayTangDan {
    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
        int n = arr.length;
        int dem = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                dem++;
                System.out.print("Dãy " + dem + ": [");
                boolean tang = true;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    if (k < j) {
                        System.out.print(", ");
                        if (arr[k] >= arr[k + 1]) {
                            tang = false;
                        }
                    }
                }

                System.out.println("]");//xún dòng

                if (tang) {
                    System.out.println(" tăng dần");
                }
            }
        }
        System.out.println("Tổng số dãy con: " + dem);
    }
}

