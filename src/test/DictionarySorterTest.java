package test;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

//тест проверяет, существует ли файл output.txt после выполнения сортировки.
public class DictionarySorterTest {
    @Test
    public void testOutputFileExists() {
        String outputFile = "output.txt";
        File file = new File(outputFile);
        assertTrue(file.exists());
    }
}
