package behavioural.memento;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        var lastState = states.get(states.size() - 1);
        states.remove(lastState);

        return lastState;
    }
}
