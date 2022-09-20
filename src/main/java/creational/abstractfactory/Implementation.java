package creational.abstractfactory;

import creational.abstractfactory.app.ContactForm;
import creational.abstractfactory.material.MaterialWidgetFactory;

public class Implementation {
    public static void main(String[] args) {
        new ContactForm().render(new MaterialWidgetFactory());
    }
}
