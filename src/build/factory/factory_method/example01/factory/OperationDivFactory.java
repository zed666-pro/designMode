package build.factory.factory_method.example01.factory;

import build.factory.factory_method.example01.product.Operation;
import build.factory.factory_method.example01.product.OperationDiv;

/**
 * @description: 除法工厂
 * @author: shengaojie
 * @create: 2023-12-03
 **/

public class OperationDivFactory implements OperationFactory{
    @Override
    public Operation getOperation() {
        return new OperationDiv();
    }
}
