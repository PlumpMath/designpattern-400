package behavior.command;

/**
 * Created by ZyL on 2017/2/23.
 */
public class AReceiverCommand implements Command{
    Receiver receivcer;

    public AReceiverCommand(Receiver receivcer) {
        this.receivcer = receivcer;
    }

    @Override
    public void execute() {
        receivcer.action();
    }
}
