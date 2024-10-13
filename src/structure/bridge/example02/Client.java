package structure.bridge.example02;

/**
 * @description:
 * @author: shengaojie
 * @create: 2023-12-13
 **/

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        Video video = new Video();
        Huawei huawei = new Huawei();
        Apple apple = new Apple();
        huawei.setSoftWare(video);
        apple.setSoftWare(game);
        huawei.execute();
        apple.execute();
    }
}
