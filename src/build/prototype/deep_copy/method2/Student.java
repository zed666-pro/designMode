package build.prototype.deep_copy.method2;

import java.io.Serializable;

/**
 * @description: null
 * @author: shengaojie
 * @create: 2023-12-04
 **/

public class Student implements Cloneable {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //引用类型的成员变量需要重写clone方法
    //如果Student中的成员变量还有引用类型，其也需要重写clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
