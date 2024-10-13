package structure.combination.example01;

/**
 * @Author shengaojie
 * @Date 2023/7/27 19:55
 * @ClassName: MenuItem
 * @Description: TODO
 * @Version 1.0
 */
public class MenuItem extends MenuComponet {
    //没有类似于add，remove，getChild等方法
    public MenuItem(String name,int level) {
        this.name = name;
        this.level = level;

    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
