package principle.demeter.demo1.before;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/10 21:38
 */


public class PizzaStore {

    public void takeOrder(){
        System.out.println("接受到订单");
    }

    public void prepareSource(){
        System.out.println("准备订单食材");
    }

    public void cookFood(){
        System.out.println("制作食物");
    }

    public void packOrder(){
        System.out.println("订单打包配送");
    }
}
