package bieu_thuc_chinh_quy;

public class bai1 {
    public static void main(String[] args) {
        //SỐ ĐIỆN THOẠI
        String Phone = "(0|\\(\\+84\\))3[2-9]\\d{7}";

        System.out.println("0323456789".matches(Phone));
        System.out.println("(+84)323456789".matches(Phone));
        System.out.println("+84323456789".matches(Phone));

        //GMAIL
        String Email = "\\W{6,32}@\\W{2,12}\\.\\W{2,12}";
        System.out.println("my_email123@gmail.com".matches(Email));

        //user
        String user = "[\\w.]{6,32}";
        System.out.println("abc123".matches(user));
        
        //password

        String pass = "[A-Z][a-z0-9!@#$%^&*.]{5,31}";
        System.out.println("Abc123".matches(pass));
    }
}
