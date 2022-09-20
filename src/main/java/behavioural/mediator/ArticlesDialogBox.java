package behavioural.mediator;

public class ArticlesDialogBox {
    private ListBox articlesListBox = new ListBox();
    private TextBox titlesTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox() {
        articlesListBox.addEventHandler(this::articleSelected);
        titlesTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article 1");
        System.out.println("Textbox: " + titlesTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
    }

    private void titleChanged() {
        var content = titlesTextBox.getContent();
        var isEmpty = content.isBlank();
        saveButton.setEnabled(!isEmpty);
    }

    private void articleSelected() {
        titlesTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }
}
