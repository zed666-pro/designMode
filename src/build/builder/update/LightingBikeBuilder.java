package build.builder.update;

/**
 * @Author shengaojie
 * @Date 2023/7/26 16:56
 * @ClassName: LightingBike
 * @Description: TODO
 * @Version 1.0
 */
public class LightingBikeBuilder extends Builder {


    @Override
    public void buildSeat() {
        bike.setSeat("闪电车座");
        System.out.println("制造闪电车座");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("闪电车身");
        System.out.println("制造闪电车身");
    }

    @Override
    public void buildWheel() {
        bike.setWheel("闪电车轮");
        System.out.println("制造闪电车轮");
    }


}
