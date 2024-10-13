package behavior.command.example02;

/**
 * @description: 购物命令
 * @author: shengaojie
 * @create: 2023-12-13
 **/

public class ShoppingCommand extends Command{

    public ShoppingCommand(BoyFriend boyFriend) {
        super(boyFriend);
    }

    @Override
    void execute() {
        boyFriend.doAction("购物");
    }
}
