package build.prototype.deep_copy.method1;

import java.io.*;

/**
 * @description: null
 * @author: shengaojie
 * @create: 2023-12-04
 **/

public class Teacher implements Serializable,Cloneable {
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

    public Student getStudent() {
        return student;
    }

    @Override
    public Teacher clone() {
        try(ObjectOutputStream obo =
                    new ObjectOutputStream(new FileOutputStream(filePath + "teacher.txt"));
            ObjectInputStream obi =
                    new ObjectInputStream(new FileInputStream(filePath + "teacher.txt"))){
            obo.writeObject(this);
            obo.flush();


            return  (Teacher)obi.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
