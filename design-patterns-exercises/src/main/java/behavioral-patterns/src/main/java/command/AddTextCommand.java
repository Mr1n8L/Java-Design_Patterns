package command;

public class AddTextCommand implements Command {
    private TextEditor editor;
    private String newText;

    public AddTextCommand(TextEditor editor, String newText) {
        this.editor = editor;
        this.newText = newText;
    }

    @Override
    public void execute() {
        editor.appendText(newText);
        System.out.println("Text after adding: " + editor.getText());
    }

    @Override
    public void undo() {
        editor.removeText(newText);
        System.out.println("Text after undo: " + editor.getText());
    }
}
