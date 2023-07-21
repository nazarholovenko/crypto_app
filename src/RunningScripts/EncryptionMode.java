import CryptoAlgorithms.EncryptionAlgorithm;
import NavigationBar.RunningMode;

public class EncryptionMode implements RunningMode {
    private EncryptionAlgorithm encryptionAlgorithm;

    public EncryptionMode() {
        encryptionAlgorithm = new EncryptionAlgorithm();
    }

}