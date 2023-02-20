package behavior.template;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/7 20:50
 */


public class ConcreteClass_Baocai extends AbstractClass{

    @Override
    public void popuVegetable() {
        System.out.println("倒入包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("加入耗油，味精");
    }
}
