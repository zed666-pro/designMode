package principle.openClose;

public class Test {
    public static void main(String[] args) {
        HeimaSpecificSkin skin = new HeimaSpecificSkin();
        DefaultSpecificSkin skin1 = new DefaultSpecificSkin();

        SouGouInput input = new SouGouInput();
       // input.setSkin(skin);
        input.setSkin(skin1);
        input.display();
    }
}
