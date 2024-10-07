import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "infa.txt";  //Ввод
        String outputFilePath = "vivod.svc";  //Вывод

        try {
            // Читаем файл
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            // Подсчет количества символов
            int totalCharacters = content.length();

            // Подсчет количества символов без пробелов
            int charactersWithoutSpaces = content.replace(" ", "").length();

            // Подсчет количества слов
            String[] words = content.trim().split("\\s+");
            int wordCount = words.length;

            // Вывод в консоль
            System.out.println("Количество символов в тексте: " + totalCharacters);
            System.out.println("Количество символов в тексте без пробелов: " + charactersWithoutSpaces);
            System.out.println("Количество слов: " + wordCount);

            // Запись результатов в .svc файл
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            writer.write("Результаты анализа текста:\n");
            writer.write("Количество символов в тексте: " + totalCharacters + "\n");
            writer.write("Количество символов в тексте без пробелов: " + charactersWithoutSpaces + "\n");
            writer.write("Количество слов: " + wordCount + "\n");
            writer.close();

            System.out.println("Результаты записаны в файл: " + outputFilePath);

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}


