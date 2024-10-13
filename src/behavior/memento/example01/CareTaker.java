package behavior.memento.example01;

import java.util.Iterator;

/**
 * @description: 管理者类
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class CareTaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
