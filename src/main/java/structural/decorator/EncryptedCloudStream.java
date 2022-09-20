package structural.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EncryptedCloudStream implements Stream {
    private Stream stream;

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        stream.write(encrypted);
    }

    private String encrypt(String data) {
        return "!@#$%^&*()";
    }
}
