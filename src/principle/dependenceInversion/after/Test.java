package principle.dependenceInversion.after;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setDisk(new XiJieHardDisk());
       // computer.setCpu(new IntelCpu());
        computer.setCpu(new ArmCpu());
        computer.setMemory(new KingstonMemory());

        computer.run();
    }
}
