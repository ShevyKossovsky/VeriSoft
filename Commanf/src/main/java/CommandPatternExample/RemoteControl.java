package CommandPatternExample;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        System.out.println("RemoteControl is executing command...");
        command.execute();
    }
}
