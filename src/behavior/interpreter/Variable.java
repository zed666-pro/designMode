package behavior.interpreter;

/**
 * @Author shengaojie
 * @Date 2023/8/1 17:03
 * @ClassName: Variable
 * @Description: 终结符表达式
 * @Version 1.0
 */
public class Variable extends AbstractExpression{
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        int value = context.getValue(this);
        return value;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "name='" + name + '\'' +
                '}';
    }
}
