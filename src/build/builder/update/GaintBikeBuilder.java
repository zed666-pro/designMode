package build.builder.update;

/**
 * @Author shengaojie
 * @Date 2023/7/26 16:55
 * @ClassName: GaintBike
 * @Description: TODO
 * @Version 1.0
 */
public class GaintBikeBuilder extends Builder {
    @Override
    public void buildSeat() {
        bike.setSeat("捷安特坐车");
        System.out.println("制造捷安特车座");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("捷安特车架");
        System.out.println("制造捷安特车身");
    }

    @Override
    public void buildWheel() {
        bike.setWheel("捷安特车轮");
        System.out.println("制造捷安特车轮");
    }


}
