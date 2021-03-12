package creationalPattern.builderPattern;

public interface ComputerBuilder {
    ComputerBuilder buildCpu();
    ComputerBuilder buildRam();
    ComputerBuilder buildHardDisk();
    ComputerBuilder buildGraphicCard();
    ComputerBuilder buildMonitor();
    ComputerBuilder buildOs();
    Computer build();
}
