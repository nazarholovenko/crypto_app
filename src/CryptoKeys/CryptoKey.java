package CryptoKeys;

public abstract class CryptoKey {
    private final int key;

    public CryptoKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
}
