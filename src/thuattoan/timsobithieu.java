package thuattoan;

public class timsobithieu {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int soThieu = arr[i + 1] - arr[i];
            if(soThieu > 1){
                for(int j = 1; j < soThieu; j++){
                    System.out.println("Số bị thiếu là: " + (arr[i] + j));
                }
            }
        }
    }
}
