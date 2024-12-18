package CommandPatternExample;

public class Client {
    public static void main(String[] args) {
        // Create a Television object (Receiver)
        Television tv = new Television();

        // Create concrete Command objects
        // Command to turn on the television
        Command turnOnCommand = new TurnOnCommand(tv); // Error: should be TurnOnCommand instead of TurnOfCommand
        // Command to turn off the television
        Command turnOffCommand = new TurnOffCommand(tv); // Error: should be TurnOffCommand instead of TurnOnCommand
        // Command to adjust the channel
        Command adjustChannelCommand = new AdjustChannelCommand(tv);

        // Create a RemoteControl (Invoker) object to manage the commands
        RemoteControl remoteControl = new RemoteControl(); // Rename 'receiver' to 'remoteControl' for clarity

        // Set the command to turn on the television and execute it
        remoteControl.setCommand(turnOnCommand);
        remoteControl.executeCommand();

        // Set the command to adjust the channel and execute it
        remoteControl.setCommand(adjustChannelCommand);
        remoteControl.executeCommand();

        // Set the command to turn off the television and execute it
        remoteControl.setCommand(turnOffCommand);
        remoteControl.executeCommand();
    }
}
