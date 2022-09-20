package behavioural.visitor;

public class PlainTextOperation implements Operation {

    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Heading text");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Anchor text");
    }
}
