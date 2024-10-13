package behavior.interpreter;

/**
 * @Author shengaojie
 * @Date 2023/8/1 17:02
 * @ClassName: AbstractExpression
 * @Description: 抽象表达式
 * @Version 1.0
 */
public abstract class AbstractExpression {

    public abstract int interpret(Context context);
}
