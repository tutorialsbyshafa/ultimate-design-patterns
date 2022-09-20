package creational.builder;

public class Implementation {
    public static void main(String[] args) {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        var builder = new PdfDocumentBuilder();
        presentation.export(builder);

        var movideBuilder = new MovieBuilder();
        presentation.export(movideBuilder);


        var pdf = builder.getPdfDocument();
        var movie = movideBuilder.getMovide();
    }
}
