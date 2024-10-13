package structure.adapter.example01;

/**
 * @description: 客户端
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class Client {

    public static void main(String[] args) {
        Translate translate = new Translate();
        speak(translate);
    }

    public static void speak(English english){
        english.request();
    }

}
