package behavior.command.example01;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author shengaojie
 * @Date 2023/7/28 10:09
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("蛋炒饭", 2);
        Order order = new Order(1, map);

        Map<String,Integer> map1 = new HashMap<>();
        map1.put("咖喱炒鸡", 3);
        Order order1 = new Order(12, map1);

        SeniorChef chef = new SeniorChef();

        OrderCommand command = new OrderCommand(chef, order);
        OrderCommand command1 = new OrderCommand(chef, order1);
        Waiter waiter = new Waiter();
        waiter.setCommands(command);
        waiter.setCommands(command1);

        waiter.orderUp();

    }
}
