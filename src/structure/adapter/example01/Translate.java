package structure.adapter.example01;

/**
 * @description: 适配类
 * @author: shengaojie
 * @create: 2023-12-12
 **/

public class Translate extends English {
   private Chinese chinese = new Chinese();

    @Override
    void request() {
        System.out.print("翻译官，先翻译：");
        chinese.specificRequest();
        System.out.println("how are you?");
    }
}
