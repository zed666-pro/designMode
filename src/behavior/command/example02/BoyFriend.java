package behavior.command.example02;

/**
 * @description: 命令的执行者
 * @author: shengaojie
 * @create: 2023-12-13
 **/

public class BoyFriend {
    String name;

    public BoyFriend(String name) {
        this.name = name;
    }

    public void doAction(String actionTpye){
        System.out.println(name + "带你去" + actionTpye);
    }
}
