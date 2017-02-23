package structure.proxy;

/**
 * Created by ZyL on 2017/2/23.
 * 代理模式
 */
public class Main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.requst();
    }
}
