package principle.demeter.demo1.before;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/10 21:38
 */


public class Consumer {

    //这里我们看到PizzaStore的很多接口是暴露在Consumer中的
    //但是按照迪米特法则，不应该出现。因此我么需要将这些暴露出来的方法的
    //转移到PizzaStore内部去试下
    public void orderPizza(PizzaStore store){
        store.takeOrder();
        store.prepareSource();
        store.cookFood();
        store.packOrder();

    }
}
