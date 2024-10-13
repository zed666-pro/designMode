package behavior.memento.example02.black_box_memento;

/**
 * @Author shengaojie
 * @Date 2023/8/1 15:36
 * @ClassName: RoleStateCaretaker
 * @Description: 管理者类
 * @Version 1.0
 */
public class RoleStateCaretaker {
    Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
