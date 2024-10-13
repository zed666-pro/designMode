package build.builder.update;

/**
 * @description: 指挥者类
 * @author: shengaojie
 * @create: 2023-12-05
 **/

public class Director {
    Builder builder;
    String world;
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void startBuild(){
        builder.buildFrame();
        builder.buildSeat();
        builder.buildWheel();
    }
}
