package structure.combination.example01;

/**
 * @Author shengaojie
 * @Date 2023/7/27 19:53
 * @ClassName: MenuComponet
 * @Description: 抽象根节点
 * @Version 1.0
 */
public abstract class MenuComponet {

    String name;

    int level;

    //因为在菜单中不需要写add方法，所以不能设置为抽象方法
    public  void add(MenuComponet componet){

    }

    public void remove(MenuComponet componet){}

    public MenuComponet getChild(int i){
        return null;
    }

    public abstract void print();

}
