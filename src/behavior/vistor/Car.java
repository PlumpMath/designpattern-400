package behavior.vistor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZyL on 2017/2/23.
 */
public class Car implements Visitable {

    Engine engine;
    Body body;
    List<Wheel> wheels;

    public Car() {
        engine = new Engine();
        body = new Body();
        wheels = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            wheels.add(new Wheel("wheel"+i));
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCar(this);
        body.accept(visitor);
        engine.accept(visitor);
        for(Wheel w : wheels){
            w.accept(visitor);
        }
    }
}
