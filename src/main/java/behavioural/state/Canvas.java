package behavioural.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Canvas {
    private Tool currentTool;

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }
}
