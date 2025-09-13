package set.Bai1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Set1 {

    // a. Loại bỏ phần tử trùng lặp
    public static void loaiBoTrungLap(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println("Các phần tử duy nhất: " + set);
    }

    // b. Tính tổng các phần tử không trùng lặp
    public static void tongKhongTrungLap(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int sum = 0;
        for (int num : set) {
            sum += num;
        }
        System.out.println("Tổng các phần tử không trùng lặp: " + sum);
    }

    // c. Tìm các phần tử chung trong 2 mảng
    public static void phanTuChung(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int num : arr2) {
            set2.add(num);
        }
        set1.retainAll(set2);
        System.out.println("Các phần tử chung: " + set1);
    }

    // d. Tìm phần tử lớn nhất và nhỏ nhất
    public static void timMaxMin(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int max = Collections.max(set);
        int min = Collections.min(set);
        System.out.println("Phần tử lớn nhất: " + max);
        System.out.println("Phần tử nhỏ nhất: " + min);
    }
}
