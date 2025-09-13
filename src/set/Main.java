package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Student>students = new TreeSet<>();

        students.add(new Student(1, "Nguyễn Văn A", 9.6));
        students.add(new Student(2, "Nguyễn Văn A", 9.6));
        students.add(new Student(3, "Nguyễn Văn C", 6.6));
        students.add(new Student(4, "Nguyễn Văn D", 8.6));
        students.add(new Student(5, "Nguyễn Văn E", 4.6));
        students.add(new Student(6, "Nguyễn Văn F", 5.6));


        for (Student student : students){
            System.out.println(student.getName() + " - " + student.getDiem());
        }
    }
}
