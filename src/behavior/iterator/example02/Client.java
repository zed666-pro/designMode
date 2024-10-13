package behavior.iterator.example02;

/**
 * @Author shengaojie
 * @Date 2023/8/1 15:06
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Student student = new Student("shengaojie", "1");
        Student student1 = new Student("yangtianci", "2");
        Student student2 = new Student("dingcc", "3");

        StudentAggregate studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(student);
        studentAggregate.addStudent(student1);
        studentAggregate.addStudent(student2);

        StudentIterator iterator = studentAggregate.getStudentIterator();
        while(iterator.hasNext()){
            Student stu = (Student) iterator.next();
            System.out.println(stu);
        }
    }
}
