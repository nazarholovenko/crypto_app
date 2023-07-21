import CryptoAlgorithms.EncryptionAlgorithm;
import CryptoKeys.CryptoKey;
import CryptoKeys.MoveAtOneLetter;
import CryptoKeys.MoveAtThreeLetters;
import CryptoKeys.MoveAtTwoLetters;
import NavigationBar.RunningMode;

import java.util.Scanner;

public class EncryptionMode implements RunningMode {
    private static final String ENTER_KEY = "Введіть криптоключ (1, 2 або 3): ";
    private static final String WRONG_KEY = "Неправильний криптоключ. Використовується криптоключ 1.";
    private EncryptionAlgorithm encryptionAlgorithm;

    public EncryptionMode() {
        encryptionAlgorithm = new EncryptionAlgorithm();
    }
    private CryptoKey selectCryptoKey() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(ENTER_KEY);
        int key = scanner.nextInt();
        scanner.nextLine();

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