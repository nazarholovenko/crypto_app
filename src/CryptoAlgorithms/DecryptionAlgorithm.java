package CryptoAlgorithms;

import CryptoKeys.CryptoKey;

public class DecryptionAlgorithm {
    private char decryptCharacter(char character, int moveBy) {
        char[] alphabet;
        if (Character.isLowerCase(character)) {
            alphabet = EncryptionAlgorithm.UKRAINIAN_ALPHABET_LOWER_CASE;
        } else if (Character.isUpperCase(character)) {
            alphabet = EncryptionAlgorithm.UKRAINIAN_ALPHABET_UPPER_CASE;
        } else {
            return character;
        }
        int index = getIndex(character, alphabet);
        int shiftedIndex = (index - moveBy + alphabet.length) % alphabet.length;
        return alphabet[shiftedIndex];
    }

    private int getIndex(char character, char[] alphabet) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == character) {
                return i;
            }
        }
        return -1;
    }
}


