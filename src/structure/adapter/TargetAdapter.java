package structure.adapter;

/**
 * Created by ZyL on 2017/2/23.
 */
public class TargetAdapter extends Target {
    Adaptee adaptee;

    public TargetAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
