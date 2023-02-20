package principle.dependenceInversion.before;

public class Computer {
    private XiJieHardDisk disk;
    private IntelCpu cpu;
    private KingstonMemory memory;

    public XiJieHardDisk getDisk() {
        return disk;
    }

    public void setDisk(XiJieHardDisk disk) {
        this.disk = disk;
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public void run(){
        System.out.println("计算机开始工作");
        cpu.run();
        memory.save();
        String data = disk.get();
        System.out.println("从硬盘中获取数据");
    }
}
