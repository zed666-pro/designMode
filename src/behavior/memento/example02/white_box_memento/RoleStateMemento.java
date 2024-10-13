package behavior.memento.example02.white_box_memento;

/**
 * @Author shengaojie
 * @Date 2023/8/1 15:35
 * @ClassName: RoleStateMemento
 * @Description: 备忘录类
 * @Version 1.0
 */
public class RoleStateMemento {
    int vit;
    int atk;
    int def;

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }
}
