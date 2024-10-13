package behavior.mediator;

/**
 * @Author shengaojie
 * @Date 2023/8/1 16:22
 * @ClassName: Tenant
 * @Description: TODO
 * @Version 1.0
 */
public class Tenant extends Person{

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void contact(String message) {
        mediator.contact(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("租房者拿到消息：" + message);
    }

}
