package behavior.memento.example01;

import java.util.concurrent.TimeUnit;

/**
 * @description: 发起者
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class GameRole {
     int vit;
     int attack;
     int def;

    public GameRole() {
        this.vit = 100;
        this.attack = 100;
        this.def = 100;
    }

    public Memento savaMemento(){
        return new Memento(this.vit,
                            this.attack,
                            this.def);
    }


    public void recoverFromMemento(Memento memento){
        this.vit = memento.vit;
        this.attack = memento.attack;
        this.def = memento.def;
    }

    // public void fight() throws InterruptedException {
    //     this.vit = vit - 10;
    //     this.attack = attack - 20;
    //     this.def = 0;
    //     TimeUnit.MILLISECONDS.sleep(100);
    //
    // }

    @Override
    public String toString() {
        return "GameRole{" +
                "vit=" + vit +
                ", attack=" + attack +
                ", def=" + def +
                '}';
    }
}
