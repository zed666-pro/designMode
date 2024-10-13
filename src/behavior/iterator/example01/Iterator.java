package behavior.iterator.example01;

/**
 * @description: 迭代器接口
 * @author: shengaojie
 * @create: 2023-12-13
 **/

public interface Iterator<T> {
    T currentItem();

    T nextItem();

    boolean hasNext();

    T firstItem();
}
