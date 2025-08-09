package Static.Bai3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Chuyển đổi chuỗi với định dạng dd/MM/yyyy sang LocalDate.
 * Chuyển đổi chuỗi với định dạng yyyy/MM/dd sang LocalDate.
 * Chuyển đổi LocalDate với định dạng sang chuỗi với định dạng dd/MM/yyyy.
 * Chuyển đổi LocalDate với định dạng sang chuỗi với định dạng yyyy/MM/dd.
 */
public class LocalDateUtil {

    private static final DateTimeFormatter FORMAT_ddMMyyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMAT_yyyyMMdd = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    // Chuyển chuỗi dd/MM/yyyy → LocalDate
    public static LocalDate fromString_ddMMyyyy(String date) {
        return LocalDate.parse(date, FORMAT_ddMMyyyy);
    }

    // Chuyển chuỗi yyyy/MM/dd → LocalDate
    public static LocalDate fromString_yyyyMMdd(String date) {
        return LocalDate.parse(date, FORMAT_yyyyMMdd);
    }

    // Chuyển LocalDate → chuỗi dd/MM/yyyy
    public static String toString_ddMMyyyy(LocalDate date) {
        return date.format(FORMAT_ddMMyyyy);
    }

    // Chuyển LocalDate → chuỗi yyyy/MM/dd
    public static String toString_yyyyMMdd(LocalDate date) {
        return date.format(FORMAT_yyyyMMdd);
    }
}

