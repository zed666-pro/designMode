package principle.demeter.demo1.after;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/10 21:38
 */

/*
* 改进的地方有两点：
*     1.在Consumer中不再暴漏PizzaStore的实现
*     2.在PizzaStore中新增了一个orderPizza的方法，并且将
*       之前的方法改成了private来修饰
*
* */
public class Consumer {


    public void orderPizza(PizzaStore store){
//        store.takeOrder();
//        store.prepareSource();
//        store.cookFood();
//        store.packOrder();
          store.orderPizza();

    }
}
