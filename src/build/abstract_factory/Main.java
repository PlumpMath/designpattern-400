package build.abstract_factory;

import build.pojo.ProductA;

/**
 * Created by ZyL on 2017/2/23.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();

        ProductA p1 = factory1.createProductA();
        ProductA p2 = factory2.createProductA();
        System.out.println(p1);
        System.out.println(p2);
    }
}
