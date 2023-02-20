package principle.openClose;


/*
* 搜狗输入法中加入了一个皮肤接口，调用该接口中的display方法。
* 开闭原则希望的是，对修改关闭，对于扩展开放。如果加入一个新的皮肤的话
* 只要创建一个新的类来实现AbstractSkin接口即可，不需要修改别的地方。
* */
public class SouGouInput {

  private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public AbstractSkin getSkin() {
        return skin;
    }

    public void display(){
        skin.display();
    }
}
