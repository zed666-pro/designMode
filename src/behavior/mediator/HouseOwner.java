package behavior.mediator;

/**
 * @Author shengaojie
 * @Date 2023/8/1 16:24
 * @ClassName: HouseOwner
 * @Description: TODO
 * @Version 1.0
 */
public class HouseOwner extends Person{

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void contact(String message) {
        mediator.contact(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("房屋主人拿到消息：" + message);
    }
}
