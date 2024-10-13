package build.prototype.shallow_copy;

import org.junit.Test;

/**
 * @description: 演示浅拷贝中存在的问题
 * @author: shengaojie
 * @create: 2024-03-26
 **/

public class Citation01 implements Cloneable{
    //引用类型的数据
    private Student student;


    @Override
    protected Citation01 clone() throws CloneNotSupportedException {
        return (Citation01) super.clone();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Test
    public void test() throws CloneNotSupportedException {
        Student student1 = new Student("shengaojie");
        Citation01 citation01 = new Citation01();
        citation01.setStudent(student1);
        Citation01 cloned = citation01.clone();
        System.out.println("两个Student是否是同一个对象呢：" + (citation01.getStudent() == cloned.getStudent()));

        //因为是指向同一个对象的引用，因此如何我们修改其中的一个，另一个也会变化
        cloned.getStudent().setName("dingcc");
        System.out.println("克隆前的学生的名字：" + citation01.getStudent());
        System.out.println("克隆后的学生的名字：" + cloned.getStudent());

    }
}
