package structure.combination.example01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author shengaojie
 * @Date 2023/7/27 19:55
 * @ClassName: Menu
 * @Description: TODO
 * @Version 1.0
 */
public class Menu extends MenuComponet{

    private List<MenuComponet> list = new ArrayList<>();

    public Menu(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponet componet) {
        list.add(componet);
    }

    @Override
    public void remove(MenuComponet componet) {
        list.remove(componet);
    }

    @Override
    public MenuComponet getChild(int i) {
        return list.get(i);
    }

    @Override
    public void print() {

        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponet componet : list) {
            componet.print();
        }
    }
}
