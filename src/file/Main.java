package file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        showList();
        createList();
    }

    public static void createList() throws IOException {
        //Bước 1: đọc dữ lệu từ file đưa vào list Student
        File file = new File("src/file/data/student.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        Student student;
        List<Student> students = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            String[] info = line.split(",");
            student = new Student(Integer.parseInt(info[0]),
                    info[1],
                    Double.parseDouble(info[2]));
            students.add(student);
        }
        System.out.println(bufferedReader.readLine());


        bufferedReader.close();
        fileReader.close();

        Student student2 = new Student();
        student2.input();
        students.add(student2);

        file = new File("src/file/data/student.txt");
        FileWriter fileWrite = new FileWriter(file);
        BufferedWriter bufferedWrite = new BufferedWriter(fileWrite);

        for (Student s : students){
            bufferedWrite.write(s.toString() + "\n");
        }

        bufferedWrite.close();
        fileWrite.close();
    }

    public static void showList() throws IOException {
        //Bước 1: đọc dữ lệu từ file đưa vào list Student
        File file = new File("src/file/data/student.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        Student student;
        List<Student> students = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            String[] info = line.split(",");
            student = new Student(Integer.parseInt(info[0]),
                    info[1],
                    Double.parseDouble(info[2]));
            students.add(student);
        }
        System.out.println(bufferedReader.readLine());


        bufferedReader.close();
        fileReader.close();
        //Bước 2: Show list

        for (int i = 0; i < students.size(); i++) {
            System.out.printf("\n\n ===== Thông tin sinh viên thứ %d ===== \n", i + 1);
            students.get(i).output();
        }
    }
}
