package behavioural.command.editor;

public interface UndoableCommand extends Command {
    void unExecute();

}
