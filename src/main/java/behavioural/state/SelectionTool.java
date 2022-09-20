package behavioural.state;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SelectionTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
}
