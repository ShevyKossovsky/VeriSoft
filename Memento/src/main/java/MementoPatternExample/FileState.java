package MementoPatternExample;

/**
 * The FileState class represents a Memento in the Memento design pattern.
 * It stores the state of the TextEditor and allows the state to be saved and restored.
 */
public class FileState {
    private String state; // The state of the TextEditor

    /**
     * Constructs a new FileState with the given state.
     *
     * @param state The state of the TextEditor to be stored.
     */
    public FileState(String state) {
        this.state = state;
    }

    /**
     * Gets the state stored in this FileState.
     *
     * @return The state of the TextEditor.
     */
    public String getState() {
        return state;
    }
}
