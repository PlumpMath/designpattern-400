package behavior.command;

/**
 * Created by ZyL on 2017/2/23.
 */
public class Invoker {
    Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
