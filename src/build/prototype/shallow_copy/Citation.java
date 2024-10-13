package build.prototype.shallow_copy;

import org.junit.Test;

/**
 * @Author shengaojie
 * @Date 2023/7/26 15:06
 * @ClassName: Citation
 * @Description: TODO
 * @Version 1.0
 */
public class Citation implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show(){
        System.out.println(name + " 同学获得本学期的三好学生奖！！！");
    }
    
    
    @Test
    public void test() throws CloneNotSupportedException {
        Citation citation = new Citation();
        citation.setName("张三");
        citation.show();

        Citation citation1 = citation.clone();

        citation1.setName("李四");
        citation1.show();
    }
}
