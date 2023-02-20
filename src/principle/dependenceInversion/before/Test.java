package principle.dependenceInversion.before;

public class Test {
    public static void main(String[] args) {
        //如果有想要使用新的部件改如何改进呢
        Computer computer = new Computer();
        computer.setCpu(new IntelCpu());
        computer.setDisk(new XiJieHardDisk());
        computer.setMemory(new KingstonMemory());

        computer.run();
    }
}
