package build.factory.factory_method.example01.product;



/**
 * @description: 乘法操作
 * @author: shengaojie
 * @create: 2023-12-03
 **/

public class OperationMul extends Operation {
    @Override
    public Integer operate(Integer number1, Integer number2) {
        return number1 * number2;
    }
}
