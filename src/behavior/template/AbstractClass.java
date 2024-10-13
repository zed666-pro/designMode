package behavior.template;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/7 20:45
 */


public abstract class AbstractClass {

    //模板方法
    public final void cookProcess(){
        //模板方法中规定基本方法的执行的顺序
        pourOil();
        heatOil();
        popuVegetable();
        pourSauce();
        fry();

    }

    public void pourOil(){
        System.out.println("倒油");
    }

    public void heatOil(){
        System.out.println("热油");
    }

    //导入蔬菜和调味料对于不同的菜的做法是不同的
    public abstract void popuVegetable();

    public abstract void pourSauce();

    public void fry(){
        System.out.println("抄来抄去");
    }



}
