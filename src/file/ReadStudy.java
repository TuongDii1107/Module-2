package file;

import java.io.*;

public class ReadStudy {
    public static void main(String[] args) throws IOException {
        File file = new File("src/file/data/input.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        System.out.println(bufferedReader.readLine());


        bufferedReader.close();
        fileReader.close();
    }
}
