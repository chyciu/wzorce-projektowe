package pl.sdacademy.designpatterns.memento;

public class MementoDemo {

    public static void main(String[] args) {

        final EditorText editorText = new EditorText();
        final EditorTextMementoManager mementoManager = new EditorTextMementoManager();

        mementoManager.save(new EditortextMemento(editorText));
        editorText.addText("this is first line");
        mementoManager.save(new EditortextMemento(editorText));
        editorText.addText("\nthis is 1st line continuation");
        mementoManager.save((new EditortextMemento(editorText)));
        editorText.addText("\nthis is second line");

        System.out.println(editorText.getValue());

        mementoManager.restore();
        editorText.restoreFromMemento(mementoManager.restore());

        System.out.println(editorText.getValue());
    }

}
