package build.factory.simple_factory.example01;

/**
 * @description: Operation工厂
 * @author: shengaojie
 * @create: 2023-12-03
 **/

public class OperationFactory {
    Operation operation = null;
    public  Operation getOperation(String operationType){
        switch (operationType){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new RuntimeException("不支持的操作类型");
        }
        return operation;

    }

}
