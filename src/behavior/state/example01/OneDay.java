package behavior.state.example01;

/**
 * @description: Context类，一天当中有不同的状态
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class OneDay {
    State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    public void doJob(){
        state.doAction(this);
    }
}
