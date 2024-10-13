package build.factory.factory_method.example01.factory;

import build.factory.factory_method.example01.product.OperationSub;

/**
 * @description: 减法工厂类
 * @author: shengaojie
 * @create: 2023-12-03
 **/

public class OperationSubFactory implements OperationFactory {
    @Override
    public OperationSub getOperation() {
        return new OperationSub();
    }
}
