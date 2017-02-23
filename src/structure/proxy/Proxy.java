package structure.proxy;

/**
 * Created by ZyL on 2017/2/23.
 */
public class Proxy implements  Subject{
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void requst() {
        System.out.println("before");
        subject.requst();
        System.out.println("after");
    }
}
