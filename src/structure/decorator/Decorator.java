package structure.decorator;

/**
 * Created by ZyL on 2017/2/24.
 */
public class Decorator extends Component {

    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
