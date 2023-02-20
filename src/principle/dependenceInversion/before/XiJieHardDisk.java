package principle.dependenceInversion.before;

public class XiJieHardDisk implements HardDisk{

    @Override
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据" + data);
    }

    @Override
    public String get() {
        System.out.println("使用希捷硬盘获取数据");
        return "数据";
    }
}
