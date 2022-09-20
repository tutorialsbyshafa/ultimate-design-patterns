package behavioural.command.editor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class HtmlDocument {
    private String content;


    public void makeBold() {
        content = "<b>" + content + "</b >";
    }
}
