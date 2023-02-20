package principle.dependenceInversion.after;

public class ArmCpu implements Cpu{

    @Override
    public void run() {
        System.out.println("使用Arm架构的cpu");
    }
}
