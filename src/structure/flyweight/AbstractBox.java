package structure.flyweight;

/**
 * @Author shengaojie
 * @Date 2023/7/27 10:16
 * @ClassName: AbstractBox
 * @Description: 抽象享元角色
 * @Version 1.0
 */
public abstract class AbstractBox {

    public abstract String getShape();

    //其中的shape是内部属性，color是外部属性
    public void display(String color){
        System.out.println(getShape() + ":" + color);
    }
}
