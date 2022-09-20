package behavioural.visitor;

public class Implementation {
    public static void main(String[] args) {
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());

        document.execute(new PlainTextOperation());
    }
}
