package structure.bridge;

/**
 * Created by ZyL on 2017/2/24.
 */
public abstract class Abstraction {

    protected Implementor implementor;
    public abstract void operation();

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
}
