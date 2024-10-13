package behavior.memento.example01;

/**
 * @description:
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        System.out.println("战斗开始前：");
        System.out.println(gameRole);
        Memento memento = gameRole.savaMemento();
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(memento);

        gameRole.fight();
        System.out.println("战斗开始后：");
        System.out.println(gameRole);

        gameRole.recoverFromMemento(careTaker.getMemento());
        System.out.println("读档之后：");
        System.out.println(gameRole);
    }
}
