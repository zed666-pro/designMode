package behavior.interpreter;

/**
 * @Author shengaojie
 * @Date 2023/8/1 17:05
 * @ClassName: Minus
 * @Description: 非终结符表达式
 * @Version 1.0
 */
public class Minus extends AbstractExpression{
    //减法运算的左部和右部
    private AbstractExpression left;
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return this.left.interpret(context) - this.right.interpret(context);
    }

    @Override
    public String toString() {
        return "Minus{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
