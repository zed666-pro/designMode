package principle.openClose;

/*
* 具体的一个皮肤
* */
public class DefaultSpecificSkin implements AbstractSkin{
    @Override
    public void display() {
        System.out.println("默认皮肤");
    }
}
