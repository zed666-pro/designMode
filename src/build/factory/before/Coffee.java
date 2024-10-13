package build.factory.before;

/**
 * @Author shengaojie
 * @Date 2023/7/25 23:17
 * @ClassName: Coffee
 * @Description: TODO
 * @Version 1.0
 */
public abstract class Coffee {

    public abstract String getName();
    //加糖
    public void addSugar(){
        System.out.println("加糖");

    }

    //加奶
    public void addMilk(){
        System.out.println("加奶");

    }
}
