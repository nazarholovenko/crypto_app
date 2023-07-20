import CryptoAlgorithms.BruteForceAlgorithm;
import NavigationBar.RunningMode;
import java.util.Scanner;

public class BruteForceMode implements RunningMode {
    private static final String INPUT_MESSAGE = "Введіть шлях до файлу: ";
    private static final String CONTENT_CHANGED = "Зміни збережено у файлі: ";

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(INPUT_MESSAGE);
        String inputFilePath = scanner.nextLine();

        FileReadingLogic fileReadingLogic = new FileReadingLogic();
        String encryptedText = fileReadingLogic.readFile(inputFilePath);

        BruteForceAlgorithm bruteForceAlgorithm = new BruteForceAlgorithm(encryptedText);
        bruteForceAlgorithm.bruteForceDecrypt();


        fileReadingLogic.writeFile(inputFilePath, bruteForceAlgorithm.getDecryptedText());
        System.out.println(CONTENT_CHANGED + inputFilePath);
    }
}
