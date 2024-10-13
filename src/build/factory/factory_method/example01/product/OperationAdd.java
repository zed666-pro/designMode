package build.factory.factory_method.example01.product;



/**
 * @description: 加法
 * @author: shengaojie
 * @create: 2023-12-03
 **/

public class OperationAdd extends Operation {

    @Override
    public Integer operate(Integer number1, Integer number2) {
        return number1 + number2;
    }
}
