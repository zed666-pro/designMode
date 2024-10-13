package behavior.memento.example02.white_box_memento;

/**
 * @Author shengaojie
 * @Date 2023/8/1 15:42
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        System.out.println("============角色创建的初始状态===============");
        gameRole.initSate();
        System.out.println(gameRole.toString());
        System.out.println("============战斗后===============");

        RoleStateMemento memento = gameRole.saveState();
        gameRole.fight();
        System.out.println(gameRole.toString());
        System.out.println("============使用备忘录模式恢复之后===============");
        gameRole.recoverState(memento);
        System.out.println(gameRole.toString());

    }
}
