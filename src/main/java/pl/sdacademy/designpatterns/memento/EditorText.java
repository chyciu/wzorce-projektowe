package pl.sdacademy.designpatterns.memento;

public class EditorText {

    private String value = "";

    public void addText (final String toAdd) {
        value += toAdd;
    }

    public String getValue() {
        return value;
    }

    public void restoreFromMemento (final EditortextMemento editortextMemento) {
        this.value = editortextMemento.getValue();
    }
}
