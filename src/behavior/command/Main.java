package behavior.command;

/**
 * Created by ZyL on 2017/2/23.
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        AReceiverCommand command = new AReceiverCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.call();
    }
}
