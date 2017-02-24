package structure.bridge;

/**
 * Created by ZyL on 2017/2/24.
 */
public class Main {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
}
