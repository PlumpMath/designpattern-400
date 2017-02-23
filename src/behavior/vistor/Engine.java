package behavior.vistor;

/**
 * Created by ZyL on 2017/2/23.
 */
public class Engine implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitEngine(this);
    }
}
