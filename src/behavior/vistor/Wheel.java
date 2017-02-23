package behavior.vistor;

/**
 * Created by ZyL on 2017/2/23.
 */
public class Wheel implements Visitable {
    String name;

    public Wheel(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitWheel(this);
    }
}
