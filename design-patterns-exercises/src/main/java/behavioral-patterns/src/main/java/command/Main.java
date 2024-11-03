package command;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addText("Hello ");
        editor.addText("World!");

        editor.undo();  // Should undo the "World!" addition
        editor.undo();  // Should undo the "Hello " addition
    }
}
