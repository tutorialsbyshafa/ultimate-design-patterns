package behavioural.strategy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public void store(String fileName) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }

    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
