package creationalPattern.builderPattern;

public class X201 extends Computer {
    public X201() {
        this.setType("Think Pad X201i");
    }

    @Override
    public String toString() {
        return "{" + this.getType() +
                ':' + getCpu() + ':' + getHardDisk() + ':' + getMonitor() + ':' + getOs() + ':' + getRam() +
                '}';
    }
}
