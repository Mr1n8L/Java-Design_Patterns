package command;

import java.util.Stack;

public class TextEditor {
    private StringBuilder text = new StringBuilder();
    private Stack<Command> history = new Stack<>();

    public void addText(String newText) {
        Command command = new AddTextCommand(this, newText);
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        }
    }

    public void appendText(String newText) {
        text.append(newText);
    }

    public void removeText(String newText) {
        text.delete(text.length() - newText.length(), text.length());
    }

    public String getText() {
        return text.toString();
    }
}
