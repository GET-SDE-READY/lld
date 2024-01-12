public class FacadeDemo {
    public static void main(String[] args) {
        Computer computer = new Computer(new CPU(), new Memory(), new HardDisk());
        computer.run();
    }
}

class Memory {
    String run() {
        return "Memory running";
    }

}

class HardDisk {
    String run() {
        return "HardDisk running";
    }
}

class CPU {
    String run() {
        return "CPU running";
    }
}

class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDisk hardDisk;

    public Computer(CPU cpu, Memory memory, HardDisk hardDisk) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }
    public void run() {
        System.out.println(cpu.run());
        System.out.println(memory.run());
        System.out.println(hardDisk.run());
    }
}


