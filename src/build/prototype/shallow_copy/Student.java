package build.prototype.shallow_copy;

/**
 * @description:
 * @author: shengaojie
 * @create: 2024-03-26
 **/

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
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
