package build.factory.simple_factory.example01;

/**
 * @description: 除法操作
 * @author: shengaojie
 * @create: 2023-12-03
 **/

public class OperationDiv extends Operation {
    @Override
    protected Integer operate(Integer number1, Integer number2) {
        return number1 / number1;
    }
}
