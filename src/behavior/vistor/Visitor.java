package behavior.vistor;

/**
 * Created by ZyL on 2017/2/23.
 */
public abstract class Visitor {
    public  void visitCar(Car car){}
    public  void visitBody(Body body){}
    public  void visitEngine(Engine engine){}
    public  void visitWheel(Wheel wheel){}

}
