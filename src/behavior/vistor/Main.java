package behavior.vistor;

/**
 * Created by ZyL on 2017/2/23.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.accept(new Visitor() {
            @Override
            public void visitCar(Car car) {
                System.out.println(car);
            }

            @Override
            public void visitWheel(Wheel wheel) {
                System.out.println(wheel.name);
            }
        });
    }
}
