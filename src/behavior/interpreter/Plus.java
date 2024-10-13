package behavior.interpreter;

/**
 * @Author shengaojie
 * @Date 2023/8/1 17:03
 * @ClassName: Plus
 * @Description: 非终结符表达式
 * @Version 1.0
 */
public class Plus extends AbstractExpression{
    //加法运算的左部和右部
    private AbstractExpression left;
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return this.left.interpret(context) + this.right.interpret(context);
    }
}
