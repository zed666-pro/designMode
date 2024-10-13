package behavior.command.example02;

/**
 * @description: 看电影命令
 * @author: shengaojie
 * @create: 2023-12-13
 **/

public class FilmCommand extends Command{

    public FilmCommand(BoyFriend boyFriend) {
        super(boyFriend);
    }

    @Override
    void execute() {
        boyFriend.doAction("看电影");
    }
}
