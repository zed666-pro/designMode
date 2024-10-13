package structure.decorator.example02;

/**
 * @description: 装饰者父类
 * @author: shengaojie
 * @create: 2023-12-04
 **/

public abstract class DecoratorActivity implements Activity{

    Activity activity;

    public void setActivity(Activity activity){
        this.activity = activity;
    }
}
