package MementoPatternExample;

import java.util.Stack;

/**
 * The History class acts as the Caretaker in the Memento design pattern.
 * It is responsible for saving and undoing states of the TextEditor.
 * It keeps track of the states in a Stack and allows undo functionality.
 */
public class History {
    private Stack<FileState> fileStates = new Stack<>(); // Stack to store mementos

    /**
     * Saves the current state of the TextEditor into the history.
     *
     * @param fileState The current state to be saved.
     */
    public void save(FileState fileState) {
        fileStates.push(fileState); // Add the current state to the stack
    }

    /**
     * Undoes the last change by removing the current state
     * and returning the previous state.
     *
     * @return The previous state or null if there is no previous state.
     * @throws IllegalStateException if no states are available to undo.
     */
    public FileState undo() {
        if (fileStates.isEmpty()) {
            throw new IllegalStateException("No states to undo");
        }

        fileStates.pop(); // Remove the current state
        // Return the previous state or null if the stack is empty
        return fileStates.isEmpty() ? null : fileStates.peek();
    }
}
