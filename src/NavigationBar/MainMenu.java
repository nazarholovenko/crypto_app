package NavigationBar;

import RunningScripts.DecryptionMode;
import RunningScripts.EncryptionMode;
import java.util.Scanner;

public class MainMenu {
    private static final String GOODBYE_MESSAGE = "До побачення!";
    private static final String WRONG_CHOICE_TRIGGER = "Неправильний вибір. Спробуйте ще раз.";

    private void displayMenuText() {
        System.out.println("===== ГОЛОВНЕ МЕНЮ =====");
        System.out.println("Виберіть режим:");
        System.out.println("1. Шифрування");
        System.out.println("2. Дешифрування");
        System.out.println("3. Дешифрування методом Brute Force");
        System.out.println("0. Вихід");
    }
    
    public void chooseMode() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenuText();
            System.out.print("Ваш вибір: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    EncryptionMode encryptionMode = new EncryptionMode();
                    encryptionMode.execute();
                }
                case 2 -> {
                    DecryptionMode decryptionMode = new DecryptionMode();
                    decryptionMode.execute();
                }
                case 3 -> {
                    BruteForceMode bruteForceMode = new BruteForceMode();
                    bruteForceMode.execute();
                }
                case 0 -> System.out.println(GOODBYE_MESSAGE);

                default -> System.out.println(WRONG_CHOICE_TRIGGER);
            }
        } while (choice != 0);
    }
}
