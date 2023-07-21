package CryptoAlgorithms;


import CryptoKeys.CryptoKey;
import CryptoKeys.MoveAtOneLetter;
import CryptoKeys.MoveAtThreeLetters;
import CryptoKeys.MoveAtTwoLetters;

public class BruteForceAlgorithm {
    private String originalEncryptedText;
    private String decryptedText;
    private CryptoKey correctKey;
    public void bruteForceDecrypt() {
        CryptoKey[] keys = {new MoveAtOneLetter(), new MoveAtTwoLetters(), new MoveAtThreeLetters()};
        int maxMatches = 0;

        for (CryptoKey key : keys) {
            String decryptedText = decrypt(originalEncryptedText, key);
            int matches = countMatchesWithSpaces(decryptedText, originalEncryptedText);

            if (matches > maxMatches) {
                this.decryptedText = decryptedText;
                this.correctKey = key;
                maxMatches = matches;
            }
        }
    }
    private String decrypt(String encryptedText, CryptoKey key) {
        DecryptionAlgorithm decryptionAlgorithm = new DecryptionAlgorithm();
        return decryptionAlgorithm.decrypt(encryptedText, key);
    }
    private int countMatchesWithSpaces(String decryptedText, String encryptedText) {
        int matches = 0;
        int length = Math.min(decryptedText.length(), encryptedText.length());

        for (int i = 0; i < length; i++) {
            if (decryptedText.charAt(i) == encryptedText.charAt(i)) {
                matches++;
            } else if (decryptedText.charAt(i) == ' ' || encryptedText.charAt(i) == ' ') {
                matches++;
            }
        }

        return matches;
    }
}



