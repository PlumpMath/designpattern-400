package structure.bridge;

/**
 * Created by ZyL on 2017/2/24.
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        implementor.operationImp();
    }

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }
}
