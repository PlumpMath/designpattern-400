package behavior.strategy;

/**
 * Created by ZyL on 2017/2/23.
 */
public class Context {
    private Strategy strategy;

    public String algorithm(){
        return strategy.algorithm();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}


