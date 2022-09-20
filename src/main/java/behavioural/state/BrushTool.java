package behavioural.state;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BrushTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
