package build.abstract_factory;

import build.pojo.ProductA;
import build.pojo.ProductB;

/**
 * Created by ZyL on 2017/2/23.
 */
public class ConcreteFactory1  extends AbstractFactory{

    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}
