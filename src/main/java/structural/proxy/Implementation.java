package structural.proxy;

public class Implementation {
    public static void main(String[] args) {
        var lib = new Library();
        String[] fileNames = {"a", "b", "c"};

        for (var fileName : fileNames) {
            lib.add(new EbookProxy(fileName));
        }

        lib.openEbook("a");
        lib.openEbook("b");
    }
}
