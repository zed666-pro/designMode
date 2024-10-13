package behavior.visitor.example02;

/**
 * @description: 具体的Element
 * @author: shengaojie
 * @create: 2023-12-15
 **/

public class Woman extends Person {
    public Woman(String name) {
        super(name);
    }

    @Override
    void accept(Action action) {
        action.visitWoman(this);
    }
}
