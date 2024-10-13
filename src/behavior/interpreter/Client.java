package behavior.interpreter;

/**
 * @Author shengaojie
 * @Date 2023/8/1 17:12
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Context context = new Context();
        context.assgin(a,1);
        context.assgin(b,2);
        context.assgin(c,5);
        int result = new Plus(new Minus(b, a),c).interpret(context);
        System.out.println(result);


    }
}
