package build.builder.update;

/**
 * @Author shengaojie
 * @Date 2023/7/26 17:05
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        GaintBikeBuilder builder = new GaintBikeBuilder();
        builder.buildBike();
        
        LightingBikeBuilder builder1 = new LightingBikeBuilder();
        builder1.buildBike();
    }
}
