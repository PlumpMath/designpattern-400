package behavior.vistor;

/**
 * Created by ZyL on 2017/2/23.
 */
public interface Visitable {
    void accept(Visitor visitor);
}
