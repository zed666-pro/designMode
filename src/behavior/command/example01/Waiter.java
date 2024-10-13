package behavior.command.example01;

import java.util.ArrayList;

/**
 * @Author shengaojie
 * @Date 2023/7/28 09:47
 * @ClassName: Waiter
 * @Description: TODO
 * @Version 1.0
 */
public class Waiter {

    private ArrayList<Command> commands = new ArrayList<>();

    public void setCommands(Command command){
        commands.add(command);
    }

    public void orderUp(){
        for (Command command : commands) {
            command.execute();
        }
    }
}
