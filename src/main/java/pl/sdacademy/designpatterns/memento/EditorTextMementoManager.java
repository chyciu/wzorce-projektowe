package pl.sdacademy.designpatterns.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorTextMementoManager {

    private Deque<EditortextMemento> editortextMementos = new ArrayDeque<>();

    public void save (final EditortextMemento editortextMemento) {
        editortextMementos.push(editortextMemento);
    }

    public EditortextMemento restore () {
        return editortextMementos.pop();
    }
}
