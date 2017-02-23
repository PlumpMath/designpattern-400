package build.pojo;

import build.simple_static_factory.ProductFactory;

/**
 * Created by ZyL on 2017/2/23.
 */
public  abstract class Product {

    public static Product getInstance(ProductFactory.ProductType type){
        return ProductFactory.getInstance(type);
    }
}
