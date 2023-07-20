package RunningScripts;

import CryptoAlgorithms.DecryptionAlgorithm;
import CryptoKeys.CryptoKey;
import CryptoKeys.MoveAtOneLetter;
import CryptoKeys.MoveAtThreeLetters;
import CryptoKeys.MoveAtTwoLetters;
import NavigationBar.RunningMode;

import java.util.Scanner;

public class DecryptionMode implements RunningMode {
    private static final String ENTER_KEY = "Введіть криптоключ (1, 2 або 3): ";
    private static final String WRONG_KEY = "Неправильний криптоключ. Використовується криптоключ 1.";
    private static final String ENTER_PATH = "Введіть шлях до файлу з зашифрованим текстом для дешифрування: ";
    private static final String DECRYPTION_SUCCEED = "Введіть шлях до файлу з зашифрованим текстом для дешифрування: ";
    private DecryptionAlgorithm decryptionAlgorithm;

    public DecryptionMode() {
        decryptionAlgorithm = new DecryptionAlgorithm();
    }

    @Override
    public void execute() {
        Scanner filePathFromUser = new Scanner(System.in);
        System.out.print(ENTER_PATH);
        String inputFilePath = filePathFromUser.nextLine();

        CryptoKey cryptoKey = selectCryptoKey();

        FileReadingLogic fileReadingLogic = new FileReadingLogic();
        String encryptedText = fileReadingLogic.readFile(inputFilePath);

        String decryptedText = decryptionAlgorithm.decrypt(encryptedText, cryptoKey);

        fileReadingLogic.writeFile(inputFilePath, decryptedText);
        System.out.println(DECRYPTION_SUCCEED + inputFilePath);
    }
    protected CryptoKey selectCryptoKey() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(ENTER_KEY);
        int key = scanner.nextInt();
        scanner.nextLine(); //

        switch (key) {
            case 1 -> {
                return new MoveAtOneLetter();
            }
            case 2 -> {
                return new MoveAtTwoLetters();
            }
            case 3 -> {
                return new MoveAtThreeLetters();
            }
            default -> {
                System.out.println(WRONG_KEY);
                return new MoveAtOneLetter();
            }
        }
    }
}
