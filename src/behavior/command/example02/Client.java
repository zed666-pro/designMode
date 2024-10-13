package behavior.command.example02;

/**
 * @description: 客户端
 * @author: shengaojie
 * @create: 2023-12-13
 **/

public class Client {
    public static void main(String[] args) {
        BoyFriend boyFriend = new BoyFriend("shengaojie");
        GirlFriend girlFriend = new GirlFriend();
        FilmCommand command = new FilmCommand(boyFriend);
        ShoppingCommand command1 = new ShoppingCommand(boyFriend);
        girlFriend.giveCommand(command);
        girlFriend.giveCommand(command1);
        girlFriend.cancelCommand(command);
        girlFriend.execute();
    }
}
