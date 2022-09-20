package behavioural.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class EditorState {
    private final String content;
}
