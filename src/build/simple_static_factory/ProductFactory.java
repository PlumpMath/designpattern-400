package build.simple_static_factory;

import build.pojo.Product;
import build.pojo.ProductA;
import build.pojo.ProductB;

/**
 * Created by ZyL on 2017/2/23.
 */
public class ProductFactory {

    public enum ProductType {
        A, B
    }

    public static Product getInstance(ProductType type) {
        Product product = null;
        switch (type) {
            case A:
                product = new ProductA();
                break;
            case B:
                product = new ProductB();
                break;
            default:
                break;
        }
        return product;
    }
}
