package pl.sdacademy.designpatterns.memento;

public class EditortextMemento {

    private String value;

    public EditortextMemento(final EditorText editorText) {
        this.value = editorText.getValue();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
