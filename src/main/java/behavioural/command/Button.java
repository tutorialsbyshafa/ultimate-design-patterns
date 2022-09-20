package behavioural.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Button {
    private String label;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }
}
