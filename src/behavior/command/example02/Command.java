package behavior.command.example02;

/**
 * @description: 命令抽象类
 * @author: shengaojie
 * @create: 2023-12-13
 **/

public abstract class Command {
    //命令真正执行的人
    BoyFriend boyFriend;

    public Command(BoyFriend boyFriend) {
        this.boyFriend = boyFriend;
    }

    abstract void execute();
}
