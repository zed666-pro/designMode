package behavior.iterator.example02;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author shengaojie
 * @Date 2023/8/1 15:02
 * @ClassName: StudentAggregateImpl
 * @Description: TODO
 * @Version 1.0
 */
public class StudentAggregateImpl implements StudentAggregate {

    List<Student> list = new ArrayList<>();
    @Override
    public void addStudent(Student student) {
        list.add(student);
    }


    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(this.list);
    }
}
