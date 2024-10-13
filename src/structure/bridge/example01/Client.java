package structure.bridge.example01;

/**
 * @Author shengaojie
 * @Date 2023/7/27 09:36
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        AVFile avFile = new AVFile();
        Mac mac = new Mac(avFile);
        mac.play("论语别裁");

    }
}
