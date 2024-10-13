package behavior.mediator;

/**
 * @Author shengaojie
 * @Date 2023/8/1 16:21
 * @ClassName: Person
 * @Description: TODO
 * @Version 1.0
 */
public abstract class Person {
    private String name;
    //每一个同事类中需要一个mediator
    public Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void contact(String message);

    public abstract void getMessage(String message);
}
