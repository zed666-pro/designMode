package behavior.iterator.example02;

import java.util.List;

/**
 * @Author shengaojie
 * @Date 2023/8/1 15:00
 * @ClassName: StudentIteratorImpl
 * @Description: TODO
 * @Version 1.0
 */
public class StudentIteratorImpl implements StudentIterator{

    List<Student> list;
    int position;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student stu = list.get(position++);
        return stu;
    }
}
