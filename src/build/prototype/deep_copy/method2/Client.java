package build.prototype.deep_copy.method2;

/**
 * @description: null
 * @author: shengaojie
 * @create: 2023-12-04
 **/

public class Client {
    public static void main(String[] args) {
        Student dingcc = new Student("dingcc");
        Teacher teacher = new Teacher("sixin");
        teacher.setStudent(dingcc);

        Teacher newTeacher = teacher.clone();
        newTeacher.setStudent(new Student("shengajie"));

        System.out.println(teacher);

        System.out.println(newTeacher);
    }

}
