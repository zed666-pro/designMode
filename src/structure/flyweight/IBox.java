package structure.flyweight;

/**
 * @Author shengaojie
 * @Date 2023/7/27 10:17
 * @ClassName: IBox
 * @Description: 具体享元
 * @Version 1.0
 */
public class IBox extends AbstractBox {

    @Override
    public String getShape() {
        return "I";
    }
}
