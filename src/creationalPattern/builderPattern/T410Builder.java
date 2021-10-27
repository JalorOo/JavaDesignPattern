package creationalPattern.builderPattern;

public class T410Builder implements ComputerBuilder{

    private final T410 computer = new T410();

    @Override
    public ComputerBuilder buildCpu() {
        computer.setCpu("T410");
        return this;
    }

    @Override
    public ComputerBuilder buildRam() {
        computer.setRam("4GB 1333MHz");
        return this;
    }

    @Override
    public ComputerBuilder buildHardDisk() {
        computer.setHardDisk("500GB 7200r");
        return this;
    }

    @Override
    public ComputerBuilder buildGraphicCard() {
        computer.setGraphicCard("Nvidia NVS 3100M");
        return this;
    }

    @Override
    public ComputerBuilder buildMonitor() {
        computer.setMonitor("14寸 1280*800");
        return this;
    }

    @Override
    public ComputerBuilder buildOs() {
        computer.setOs("Win 7");
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }
}
