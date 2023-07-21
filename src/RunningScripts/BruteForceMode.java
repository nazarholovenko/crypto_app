package RunningScripts;

import CryptoAlgorithms.BruteForceAlgorithm;
import NavigationBar.RunningMode;
import RunningScripts.FileReadingLogic;

import java.util.Scanner;

public class BruteForceMode implements RunningMode {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть шлях до файлу з зашифрованим текстом для дешифрування методом Brute Force: ");
        String inputFilePath = scanner.nextLine();

        // Читаємо вміст файлу
        FileReadingLogic fileReadingLogic = new FileReadingLogic();
        String encryptedText = fileReadingLogic.readFile(inputFilePath);

        BruteForceAlgorithm bruteForceAlgorithm = new BruteForceAlgorithm(encryptedText);
        bruteForceAlgorithm.bruteForceDecrypt();

        // Наразі bruteForceAlgorithm.bruteForceDecrypt() виводить результати дешифрування на екран,
        // тепер ми можемо змінити цю логіку, щоб записати результат у той же файл (перезаписуємо вміст)
        fileReadingLogic.writeFile(inputFilePath, bruteForceAlgorithm.getDecryptedText());
        System.out.println("Можливі дешифровані тексты успішно збережено у файлі " + inputFilePath);
    }
}