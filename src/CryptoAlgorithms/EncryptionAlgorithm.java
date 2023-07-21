package CryptoAlgorithms;

import CryptoKeys.CryptoKey;

public class EncryptionAlgorithm {
    public static final char[] UKRAINIAN_ALPHABET_LOWER_CASE =
            {'a', 'б', 'в',
                    'г', 'ґ' , 'д', 'е', 'є', 'ж', 'з',
                    'и', 'і', 'ї', 'й', 'к', 'л', 'м',
                    'н', 'о', 'п', 'р', 'с', 'т', 'у',
                    'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь',
                    'ю', 'я' };

    public static final char[] UKRAINIAN_ALPHABET_UPPER_CASE =
            {'А', 'Б', 'В',
                    'Г', 'Ґ' , 'Д', 'Е', 'Є', 'Ж', 'З',
                    'И', 'І', 'Ї', 'Й', 'К', 'Л', 'М',
                    'Н', 'О', 'П', 'Р', 'С', 'Т', 'У',
                    'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь',
                    'Ю', 'Я' };



    private int getIndex(char character, char[] alphabet) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == character) {
                return i;
            }
        }
        return -1;
    }
}



