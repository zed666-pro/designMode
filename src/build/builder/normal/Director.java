package build.builder.normal;

/**
 * @Author shengaojie
 * @Date 2023/7/26 17:02
 * @ClassName: Director
 * @Description: TODO
 * @Version 1.0
 */
public class Director {
    //引入具体的builder
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike createBike(){

        builder.buildFrame();
        builder.buildSeat();
        builder.buildWheel();
        Bike bike = builder.buildBike();
        return bike;
    }
}
