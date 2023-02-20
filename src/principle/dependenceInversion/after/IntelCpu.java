package principle.dependenceInversion.after;

public class IntelCpu implements Cpu{

    @Override
    public void run() {
        System.out.println("使用Intel处理器工作");
    }
}
