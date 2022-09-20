package behavioural.strategy;

public class Implementation {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("e");

        var imageStorage2 = new ImageStorage();
        imageStorage2.store("e2", new PngCompressor(), new BlackAndWhiteFilter());
    }
}
