import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class DictionarySorter {
    public static void main(String[] args) throws IOException {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // считываем строки из входного файла и сохраняем в ArrayList
        FileInputStream inputStream = new FileInputStream(inputFile);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayList<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();

        // сортируем строки в лексикографическом порядке
        Collections.sort(lines);

        // записываем отсортированные строки в выходной файл
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        for (String sortedLine : lines) {
            writer.write(sortedLine + "\n");
        }
        writer.close();
    }
}