package exception;

public class main {
    public static void main(String[] args) {
        try {
            checkAge(20);
        }catch (Under18YearOldException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Chương Trình Kết thúc không lỗi ");
    }
    public static void checkAge(int age) throws Under18YearOldException {
        if(age < 18){
            throw new Under18YearOldException("Bạn chưa đủ tuổi!!!");
        }
    }
}
