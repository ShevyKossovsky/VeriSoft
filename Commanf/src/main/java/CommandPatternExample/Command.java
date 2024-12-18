package CommandPatternExample;

/**
 * Command Interface
 *
 * This interface defines the execute() method that all concrete command classes
 * must implement. The purpose of this method is to execute a specific action
 * when called by the Invoker.
 */
public interface Command {

    /**
     * Executes the command.
     * This method will be implemented by concrete command classes to
     * perform specific actions (e.g., turning on/off the television,
     * changing the channel, etc.).
     */
    void execute();
}
