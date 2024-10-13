import org.junit.Test;

/**
 * @description: @builder注解的原理
 * @author: shengaojie
 * @create: 2024-01-28
 **/

public class Employee {

    private Integer id;
    private String name;
    private String hobby;

    public Employee(Integer id, String name, String hobby) {
        this.id = id;
        this.name = name;
        this.hobby = hobby;
    }

    public static EmployeeBuilder builder(){
        return new Employee.EmployeeBuilder();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    public static class EmployeeBuilder{
        private Integer id;
        private String name;
        private String hobby;
        public EmployeeBuilder id(Integer id){
            this.id = id;
            return this;
        }

        public EmployeeBuilder name(String name){
            this.name = name;
            return this;
        }


        public EmployeeBuilder hobby(String hobby){
            this.hobby = hobby;
            return this;

        }

        public Employee build(){
            return new Employee(this.id, this.name, this.hobby);
        }

    }

    public static void main(String[] args) {
        Employee employee = Employee.builder()
                .id(1)
                .name("shengaojie")
                .hobby("code")
                .build();

        System.out.println(employee);
    }



}
