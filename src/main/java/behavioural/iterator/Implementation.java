package behavioural.iterator;

public class Implementation {
    public static void main(String[] args) {
        var browseHistory = new BrowseHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");

        var iterator = browseHistory.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
