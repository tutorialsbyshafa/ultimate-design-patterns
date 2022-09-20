package structural.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CompressedCloudStream implements Stream {
    private Stream stream;

    @Override
    public void write(String data) {
        var compressed = compress(data);
        stream.write(compressed);
    }

    private String compress(String data) {
        return data.substring(0, 5);
    }
}
