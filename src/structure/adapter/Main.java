package structure.adapter;

/**
 * Created by ZyL on 2017/2/23.
 * 适配器模式？ 和代理模式有点像啊
 */
public class Main {
    public static void main(String[] args) {
        Target tar = new TargetAdapter(new Adaptee());
        tar.request();
    }
}
