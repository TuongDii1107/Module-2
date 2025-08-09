package Static;

public class m1 {
//     static int a = 10;//thuộc về class(chung cho tất cả các đối tượng)
//    public static void main(String[] args) {//thuộc về class
//        System.out.println(a);//non-static
//    }
//    void Change (){//non-static  thuộc về đối tượng
//        a = 100;
//    }

    static int a = 2;
    int b = 2;

    public static void main(String[] args) {
        m1 m2 = new m1();
        m1 m3 = new m1();

        m2.a++;
        m2.b++;

        m3.a++;
        m3.b++;

        System.out.println(m2.a);
        System.out.println(m2.b);
    }

}
