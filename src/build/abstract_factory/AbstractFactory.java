package build.abstract_factory;

import build.pojo.ProductA;
import build.pojo.ProductB;

/**
 * Created by ZyL on 2017/2/23.
 */
public abstract class AbstractFactory {
    public abstract ProductA createProductA();
    public abstract ProductB createProductB();
}
