package build.factory_method_factory;

import build.pojo.Product;
import build.pojo.ProductB;

/**
 * Created by ZyL on 2017/2/23.
 */
public class ProductBFactory extends ProductFactory {
    @Override
    public Product getInstance() {
        return new ProductB();
    }
}
