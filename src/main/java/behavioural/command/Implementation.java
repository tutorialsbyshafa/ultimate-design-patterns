package behavioural.command;

import behavioural.command.editor.BoldCommand;
import behavioural.command.editor.History;
import behavioural.command.editor.HtmlDocument;
import behavioural.command.editor.UndoCommand;

public class Implementation {

    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();

        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();

        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
