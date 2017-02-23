package behavior.strategy;

/**
 * Created by ZyL on 2017/2/23.
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new StrategyA());
        String algorithm = context.algorithm();
        System.out.println(algorithm);
    }
}
