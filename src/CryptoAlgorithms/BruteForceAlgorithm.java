package CryptoAlgorithms;


import CryptoKeys.CryptoKey;

public class BruteForceAlgorithm {
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



