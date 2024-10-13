package behavior.command.example01;

import java.util.Map;

/**
 * @Author shengaojie
 * @Date 2023/7/28 09:48
 * @ClassName: OrderCommand
 * @Description: TODO
 * @Version 1.0
 */
public class OrderCommand implements Command {
    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }


    @Override
    public void execute() {

       Map<String,Integer> foodDic  = order.getFoodDic();
        for (String s : foodDic.keySet()) {

            Integer number = foodDic.get(s);
            System.out.println(order.getDinnerTable() + "餐桌的客人下单了：" + s);
            receiver.makeFood(s,number);
        }
    }
}
