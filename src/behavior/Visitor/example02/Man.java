package behavior.visitor.example02;

/**
 * @description: 具体的Element
 * @author: shengaojie
 * @create: 2023-12-15
 **/

public class Man extends Person{
    public Man(String name) {
        super(name);
    }

    @Override
    void accept(Action action) {
        action.visitMan(this);
    }


}
