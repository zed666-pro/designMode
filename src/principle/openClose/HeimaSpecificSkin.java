package principle.openClose;

/*
* 具体的一个皮肤
* */
public class HeimaSpecificSkin implements AbstractSkin{

    @Override
    public void display() {
        System.out.println("黑马限定版皮肤");
    }
}
