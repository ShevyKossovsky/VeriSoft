package MementoPatternExample;

/**
 * The TextEditor class is the Originator in the Memento design pattern.
 * It maintains the state of the text and allows the state to be saved and restored.
 */
public class TextEditor {
    private String state; // The current state of the TextEditor

    /**
     * Sets the current state of the TextEditor.
     *
     * @param state The new state to be set.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the current state of the TextEditor.
     *
     * @return The current state of the TextEditor.
     */
    public String getState() {
        return state;
    }

    /**
     * Saves the current state of the TextEditor into a FileState object.
     *
     * @return A new FileState object containing the current state.
     */
    public FileState saveState() {
        return new FileState(state);
    }

    /**
     * Restores the state of the TextEditor from the given FileState.
     *
     * @param fileState The FileState containing the state to be restored.
     */
    public void getStateFromHistory(FileState fileState) {
        if (fileState != null) {
            this.state = fileState.getState();
        }
    }
}
