package behavior.template;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/7 20:53
 */


public class ConcreteClass_qingcai extends AbstractClass{

    @Override
    public void popuVegetable() {
        System.out.println("倒入青菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("加入生抽，白糖");
    }
}
