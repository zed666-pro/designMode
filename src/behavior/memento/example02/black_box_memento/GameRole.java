package behavior.memento.example02.black_box_memento;

/**
 * @Author shengaojie
 * @Date 2023/8/1 15:33
 * @ClassName: GameRole
 * @Description: 需要备份的对象
 * @Version 1.0
 */
public class GameRole {
    //这三个是需要备份的数据
    int vit;
    int atk;
    int def;

    public void initSate() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight() {
        this.vit = 0;
        this.atk = 100;
        this.def = 0;
    }

    //将RoleStateMemento设置为GameRole的内部类
    private class RoleStateMemento implements Memento {
        int vit;
        int atk;
        int def;

        public RoleStateMemento(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }
    }

    //保存当前状态，创建备忘录对象
    public RoleStateMemento saveState() {
        RoleStateMemento memento = new RoleStateMemento(vit, atk, def);
        return memento;
    }

    //从备忘录对象中回复之前的状态
    public void recoverState(Memento memento) {
        //将Memento 转成 RoleStateMemento
        RoleStateMemento memento1 = (RoleStateMemento)memento;
        this.vit = memento1.vit;
        this.atk = memento1.atk;
        this.def = memento1.def;

    }


    @Override
    public String toString() {

        return "当前角色的状态为:" +
                "\n \t vit=" + vit +
                "\n \t atk=" + atk +
                "\n \t def=" + def;
    }
}
