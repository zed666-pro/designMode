package build.prototype.deep_copy.method2;

import java.io.*;

/**
 * @description: null
 * @author: shengaojie
 * @create: 2023-12-04
 **/

public class Teacher implements Cloneable {
    private String name;
    private Student student;

    private String filePath;

    public Teacher(String name) {
        this.name = name;
        //classpath：/Users/shengaojie/code/Java/IDEA/designMode/out/production/designMode/build/prototype/deep_copy
        filePath = this.getClass().getResource("").getPath();
        System.out.println(filePath);
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public Teacher clone() {
        Teacher cloneTeacher;
        try {
            cloneTeacher = (Teacher)super.clone();
            //克隆出来的Student是一个深拷贝
            //给Teacher中的Student赋值，得到一个深拷贝的Teacher对象
            cloneTeacher.setStudent((Student) cloneTeacher.student.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return cloneTeacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
