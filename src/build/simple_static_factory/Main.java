package build.simple_static_factory;

import build.pojo.Product;

/**
 * Created by ZyL on 2017/2/23.
 * 简单工厂、静态工厂 模式 （还行吧）
 * DateFormatter.getInstance(int style)
 */
public class Main {

    public static void main(String args[]){
        Product productA = ProductFactory.getInstance(ProductFactory.ProductType.A);
        System.out.println(productA.getClass());
        Product productB = ProductFactory.getInstance(ProductFactory.ProductType.B);
        System.out.println(productB.getClass());

        Product instance = Product.getInstance(ProductFactory.ProductType.A);
        System.out.println(instance.getClass());
    }
}
