package build.factory_method_factory;

import build.pojo.Product;
import build.pojo.ProductA;

/**
 * Created by ZyL on 2017/2/23.
 */
public class ProductAFactory extends ProductFactory {
    @Override
    public Product getInstance() {
        return new ProductA();
    }
}
