package structure.proxy;

/**
 * Created by ZyL on 2017/2/23.
 */
public class RealSubject implements Subject {
    @Override
    public void requst() {
        System.out.println("real subject request");
    }
}
