package build.factory.factory_method.example01.factory;

import build.factory.factory_method.example01.product.Operation;
import build.factory.factory_method.example01.product.OperationAdd;


/**
 * @description: 加法操作的工厂
 * @author: shengaojie
 * @create: 2023-12-03
 **/

public class OperationAddFactory implements OperationFactory {

    @Override
    public Operation getOperation() {
        return new OperationAdd();
    }
}
