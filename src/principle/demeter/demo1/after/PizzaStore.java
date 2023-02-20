package principle.demeter.demo1.after;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/10 21:38
 */


public class PizzaStore {

    private void takeOrder(){
        System.out.println("接受到订单");
    }

    private void prepareSource(){
        System.out.println("准备订单食材");
    }

    private void cookFood(){
        System.out.println("制作食物");
    }

    private void packOrder(){
        System.out.println("订单打包配送");
    }

    public void orderPizza(){
        takeOrder();
        prepareSource();
        cookFood();
        packOrder();
    }
}
