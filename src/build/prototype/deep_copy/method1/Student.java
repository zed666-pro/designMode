package build.prototype.deep_copy.method1;

import java.io.Serializable;

/**
 * @description: null
 * @author: shengaojie
 * @create: 2023-12-04
 **/

public class Student implements Serializable {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
