package behavior.visitor.example02;

/**
 * @description:
 * @author: shengaojie
 * @create: 2023-12-15
 **/

public class Client {
    public static void main(String[] args) {
        Man man = new Man("shengaojie");
        Woman woman = new Woman("dingcc");
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(man);
        objectStructure.addElement(woman);
        SuccessAction successAction = new SuccessAction();
        objectStructure.display(successAction);

    }
}
