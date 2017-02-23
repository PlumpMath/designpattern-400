package structure.flyweight;

/**
 * Created by ZyL on 2017/2/23.
 */
public class Flyweight {
    private String name;

    public Flyweight(String name){
        this.name = name;
    }

    public void operation(){
        System.out.println(this);
    }
}
