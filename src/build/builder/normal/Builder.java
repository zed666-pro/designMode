package build.builder.normal;

/**
 * @Author shengaojie
 * @Date 2023/7/26 16:53
 * @ClassName: Builder
 * @Description: TODO
 * @Version 1.0
 */
public abstract class Builder {

    public Bike bike = new Bike();
    //建造车座
    public abstract void buildSeat();

    //建造车身
    public abstract void buildFrame();

    //建造轮子
    public abstract void buildWheel();


    public  Bike buildBike(){
        return bike;
    }
}
