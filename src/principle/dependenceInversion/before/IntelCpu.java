package principle.dependenceInversion.before;

public class IntelCpu implements Cpu{

    @Override
    public void run() {
        System.out.println("使用Intel 处理器处理");
    }
}
