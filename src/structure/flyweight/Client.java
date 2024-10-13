package structure.flyweight;

/**
 * @Author shengaojie
 * @Date 2023/7/27 10:30
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        BoxFactory factory = BoxFactory.getInstance();
        AbstractBox box1 = factory.getBox("I");
        AbstractBox box2 = factory.getBox("I");
        System.out.println(box1 == box2);


    }
}
