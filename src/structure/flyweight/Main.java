package structure.flyweight;

/**
 * Created by ZyL on 2017/2/23.
 * 享元模式
 */
public class Main {

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getFlyweight("one").operation();
        flyweightFactory.getFlyweight("two").operation();
        flyweightFactory.getFlyweight("one").operation();
    }
}
