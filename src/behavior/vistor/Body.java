package behavior.vistor;

/**
 * Created by ZyL on 2017/2/23.
 */
public class Body implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitBody(this);
    }
}
