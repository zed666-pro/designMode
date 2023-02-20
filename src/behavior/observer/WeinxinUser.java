package behavior.observer;

/**
 * @description: 具体的观察者类
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/10 17:26
 */

public class WeinxinUser implements Observer {
    private String name;

    public WeinxinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
