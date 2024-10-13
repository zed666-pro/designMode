package behavior.command.example02;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 命令的发起者
 * @author: shengaojie
 * @create: 2023-12-13
 **/

public class GirlFriend {
    List<Command> commands = new ArrayList<>();

    public void giveCommand(Command command){
        commands.add(command);
    }

    public void cancelCommand(Command command){
        commands.remove(command);
    }

    public void execute(){
        for (Command command : commands) {
            command.execute();
        }
    }
}
