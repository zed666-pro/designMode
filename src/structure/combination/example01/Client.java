package structure.combination.example01;

/**
 * @Author shengaojie
 * @Date 2023/7/27 20:03
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {

        Menu menu2 = new Menu("菜单管理", 2);
        MenuItem menuItem1 = new MenuItem("页面访问", 3);
        MenuItem menuItem2 = new MenuItem("展开菜单", 3);
        MenuItem menuItem3 = new MenuItem("编辑菜单", 3);
        MenuItem menuItem4 = new MenuItem("删除菜单", 3);
        MenuItem menuItem5 = new MenuItem("新增菜单", 3);
        menu2.add(menuItem1);
        menu2.add(menuItem2);
        menu2.add(menuItem3);
        menu2.add(menuItem4);
        menu2.add(menuItem5);

        Menu menu3 = new Menu("权限设置", 2);
        MenuItem menuItem6 = new MenuItem("页面访问", 3);
        MenuItem menuItem7 = new MenuItem("提交保存", 3);
        menu3.add(menuItem6);
        menu3.add(menuItem7);
        Menu menu4 = new Menu("角色管理", 2);
        MenuItem menuItem8 = new MenuItem("页面访问", 3);
        MenuItem menuItem9 = new MenuItem("新增角色", 3);
        MenuItem menuItem10 = new MenuItem("修改角色", 3);
        menu4.add(menuItem8);
        menu4.add(menuItem9);
        menu4.add(menuItem10);
        Menu menu1 = new Menu("系统管理", 1);
        menu1.add(menu2);
        menu1.add(menu3);
        menu1.add(menu4);
        menu1.print();

    }
}
