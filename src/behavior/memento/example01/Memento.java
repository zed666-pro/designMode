package behavior.memento.example01;

/**
 * @description: 备忘录类
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class Memento {
    int vit;
    int attack;
    int def;

    public Memento(int vit, int attack, int def) {
        this.vit = vit;
        this.attack = attack;
        this.def = def;
    }
}
