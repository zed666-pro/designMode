package behavior.visitor.example02;

/**
 * @description: 抽象的Element
 * @author: shengaojie
 * @create: 2023-12-15
 **/

public abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    abstract void accept(Action action);
}
