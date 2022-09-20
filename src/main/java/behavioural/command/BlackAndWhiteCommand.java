package behavioural.command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white filter");
    }
}
