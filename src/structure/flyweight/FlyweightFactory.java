package structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZyL on 2017/2/23.
 */
public class FlyweightFactory {
    Map<String, Object> map = new HashMap<>();

    public Flyweight getFlyweight(String key){
        Object o = map.get(key);
        if(o == null){
            Flyweight f = new Flyweight(key);
            map.put(key, f);
            return f;
        }
        return (Flyweight) o;
    }
}
