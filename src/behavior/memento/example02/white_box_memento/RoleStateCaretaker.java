package behavior.memento.example02.white_box_memento;

/**
 * @Author shengaojie
 * @Date 2023/8/1 15:36
 * @ClassName: RoleStateCaretaker
 * @Description: 管理者类
 * @Version 1.0
 */
public class RoleStateCaretaker {
    RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
