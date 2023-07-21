package RunningScripts;

import java.io.*;

public class FileReadingLogic {
    public String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Помилка при зчитуванні файлу: " + e.getMessage());
        }
        return content.toString();
    }
    public void writeFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Помилка при записі файлу: " + e.getMessage());
        }
    }
}