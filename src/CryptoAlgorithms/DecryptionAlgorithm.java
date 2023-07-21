package CryptoAlgorithms;

import CryptoKeys.CryptoKey;

public class DecryptionAlgorithm {
    private int getIndex(char character, char[] alphabet) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == character) {
                return i;
            }
        }
        return -1;
    }
}


