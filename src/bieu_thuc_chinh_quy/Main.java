package bieu_thuc_chinh_quy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello".equals("Hello"));
        System.out.println("Hello". matches("Hello"));
// + Dấu ngoặc vuông [..] : đại diện cho một kí tự nằm trong [...]
        System.out.println("a".matches("[abc]"));
        System.out.println("b".matches("[abc]"));
        System.out.println("c".matches("[abc]"));
        System.out.println("d".matches("[abc]"));
        System.out.println("aa".matches("[abc]"));

        System.out.println("aa".matches("[abc][abc]"));
        System.out.println("ab".matches("[abc][abc]"));
        System.out.println("a".matches("[abc][abc]"));

        System.out.println("aa".matches("a[abc]"));
        System.out.println("ab".matches("b[abc]"));

// + Dấu gạch nganh(-): Tự động tạo một dãy các kí tự liên tục
        System.out.println("aa".matches("a[a-z]"));
        System.out.println("ay".matches("a[a-z]"));
        System.out.println("a1".matches("a[a-z]"));

        System.out.println("a1".matches("a[a-z0-9A-Z]"));
// + Dấu mũ(^) [^...] : Ngoại trừ tập hợp các kí tự mẫu khi nằm trong [...]
        System.out.println("a1".matches("a[a-z0-9A-Z]"));
        System.out.println("a1".matches("a[^a-z0-9A-Z]"));
        System.out.println("a%".matches("a[^a-z0-9A-Z]"));


        System.out.println("SV".matches("SV[0-9]*"));
        System.out.println("SV0".matches("SV[0-9]*"));
        System.out.println("SV0001".matches("SV[0-9]*"));


        System.out.println("SV".matches("SV[0-9]+"));
        System.out.println("SV0".matches("SV[0-9]+"));
        System.out.println("SV0001A".matches("SV[0-9]+"));

        System.out.println("SV".matches("SV[0-9]?"));
        System.out.println("SV0".matches("SV[0-9]?"));
        System.out.println("SV0001".matches("SV[0-9]?"));

        System.out.println("SV".matches("SV[0-9]{3,5}"));

        System.out.println("SV".matches("SV[0-9]{3,}"));

        System.out.println("grey".matches("gr(a|e)y"));

        System.out.println("SV".matches("SV\\d{3,}"));

    }
}
