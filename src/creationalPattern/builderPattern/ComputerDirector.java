package creationalPattern.builderPattern;

public class ComputerDirector {
    ComputerBuilder computerBuilder;

    public T410 constructT410() {
        computerBuilder = new T410Builder();
        return (T410)computerBuilder.buildCpu().buildRam().buildHardDisk().buildGraphicCard().buildMonitor().buildOs().build();
    }
}
