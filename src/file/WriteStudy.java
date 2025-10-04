package file;

import java.io.*;

public class WriteStudy {
    public static void main(String[] args) throws IOException {
        File file = new File("src/file/data/output.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Mẹ cha đưa em theo con đường lớn");


        bufferedWriter.close();
        fileWriter.close();
    }
}
