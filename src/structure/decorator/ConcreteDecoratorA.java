package structure.decorator;

/**
 * Created by ZyL on 2017/2/24.
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void addBehavior(){
        System.out.println("addBehavior AAA!");
    }


    @Override
    public void operation() {
        super.operation();
        addBehavior();
    }
}
