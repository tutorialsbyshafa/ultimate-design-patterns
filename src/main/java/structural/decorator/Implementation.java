package structural.decorator;

public class Implementation {
    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream(new CloudStream()));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("123-123-123");
    }
}
