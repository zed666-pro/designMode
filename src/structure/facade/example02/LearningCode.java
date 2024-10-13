package structure.facade.example02;

/**
 * @description: 学习编程类
 * @author: shengaojie
 * @create: 2023-12-05
 **/

public class LearningCode {
    private LearningSpring learningSpring;
    private LearningJava learningJava;
    private LearningWeb learningWeb;


    public LearningCode() {
        this.learningJava = new LearningJava();
        this.learningSpring = new LearningSpring();
        this.learningWeb = new LearningWeb();
    }

    public void startLearning(){
        learningJava.startJavaLearning();
        learningWeb.startWebLearning();
        learningSpring.startSpringLearning();

    }

    public void endLearning(){
        learningJava.endJavaLearning();
        learningWeb.endWebLearnging();
        learningSpring.endSpringLearning();
    }
}
