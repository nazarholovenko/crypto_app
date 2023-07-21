package RunningScripts;

import CryptoAlgorithms.DecryptionAlgorithm;
import CryptoKeys.CryptoKey;
import CryptoKeys.MoveAtOneLetter;
import CryptoKeys.MoveAtThreeLetters;
import CryptoKeys.MoveAtTwoLetters;

import java.util.Scanner;

public class DecryptionMode {
    private static final String ENTER_KEY = "Введіть криптоключ (1, 2 або 3): ";
    private DecryptionAlgorithm decryptionAlgorithm;

    public DecryptionMode() {
        decryptionAlgorithm = new DecryptionAlgorithm();
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
                System.out.println("Неправильний криптоключ. Використовується криптоключ 1.");
                return new MoveAtOneLetter();
            }
        }

    }
}