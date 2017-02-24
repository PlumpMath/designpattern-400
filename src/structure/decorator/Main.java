package structure.decorator;

/**
 * Created by ZyL on 2017/2/24.
 */
public class Main {

    public static void main(String[] args) {
        Decorator decorator = new ConcreteDecoratorA(new ConcreteComponent());
        decorator.operation();
    }
}
