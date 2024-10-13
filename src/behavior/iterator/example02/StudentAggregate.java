package behavior.iterator.example02;

/**
 * @Author shengaojie
 * @Date 2023/8/1 15:01
 * @ClassName: StudentAggregate
 * @Description: TODO
 * @Version 1.0
 */
public interface StudentAggregate {
    public void addStudent(Student student);

    public void removeStudent(Student student);

    public StudentIterator getStudentIterator();
}
