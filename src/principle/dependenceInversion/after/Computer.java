package principle.dependenceInversion.after;

public class Computer {
    private HardDisk disk;
    private Cpu cpu;
    private Memory memory;

    public HardDisk getDisk() {
        return disk;
    }

    public void setDisk(HardDisk disk) {
        this.disk = disk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void run(){
        System.out.println("计算机开始工作");
        cpu.run();
        memory.save();
        String data = disk.get();
        System.out.println("硬盘中取出的数据为" + data);
    }
}
