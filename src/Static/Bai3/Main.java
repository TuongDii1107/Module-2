package Static.Bai3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate d1 = LocalDateUtil.fromString_ddMMyyyy("09/08/2025");
        LocalDate d2 = LocalDateUtil.fromString_yyyyMMdd("2025/08/09");

        System.out.println("Từ dd/MM/yyyy → LocalDate: " + d1);
        System.out.println("Từ yyyy/MM/dd → LocalDate: " + d2);

        System.out.println("LocalDate → dd/MM/yyyy: " + LocalDateUtil.toString_ddMMyyyy(d1));
        System.out.println("LocalDate → yyyy/MM/dd: " + LocalDateUtil.toString_yyyyMMdd(d2));
    }
}
