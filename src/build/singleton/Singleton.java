package build.singleton;

/**
 * Created by ZyL on 2017/2/23.
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton(){}

    public synchronized static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
