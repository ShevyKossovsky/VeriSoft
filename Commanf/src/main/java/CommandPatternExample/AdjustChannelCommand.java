package CommandPatternExample;

public class AdjustChannelCommand implements Command {
    private Television television;

    public AdjustChannelCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.adjustChannel();
    }
}
