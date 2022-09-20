package creational.abstractfactory.material;

import creational.abstractfactory.Button;
import creational.abstractfactory.TextBox;
import creational.abstractfactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
