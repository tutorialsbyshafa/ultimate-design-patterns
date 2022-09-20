package creational.abstractfactory.material;


import creational.abstractfactory.TextBox;

public class MaterialTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Material textbox");
    }
}
