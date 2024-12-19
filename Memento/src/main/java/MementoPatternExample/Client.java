package MementoPatternExample;

/**
 * The Client class demonstrates the usage of the Memento design pattern
 * by using the TextEditor and History classes.
 * It shows how the state of the TextEditor can be saved and restored using Memento.
 */
public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(); // Create a TextEditor instance
        History history = new History(); // Create a History instance

        // Save the initial state
        textEditor.setState("Initial state");
        history.save(textEditor.saveState());
        System.out.println("Text Editor saved state: " + textEditor.getState());

        // Save the second state
        textEditor.setState("Hello World");
        history.save(textEditor.saveState());
        System.out.println("Text Editor saved state: " + textEditor.getState());

        // Undo the last change
        FileState previousState = history.undo();
        if (previousState != null) {
            textEditor.getStateFromHistory(previousState);
        }
        System.out.println("After undo: " + textEditor.getState());
    }
}
