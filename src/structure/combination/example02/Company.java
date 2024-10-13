package structure.combination.example02;

/**
 * @description: 抽象类
 * @author: shengaojie
 * @create: 2023-12-15
 **/

public abstract class Company {
    String name;
    int depth;

    public Company(String name,int depth) {
        this.name = name;
        this.depth = depth;
    }

    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void display();
}
