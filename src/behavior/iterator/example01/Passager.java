package behavior.iterator.example01;

/**
 * @description: 乘客类
 * @author: shengaojie
 * @create: 2023-12-13
 **/

public class Passager {
    private String name;

    public Passager(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passager{" +
                "name='" + name + '\'' +
                '}';
    }
}
