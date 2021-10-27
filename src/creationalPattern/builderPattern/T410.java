package creationalPattern.builderPattern;

public class T410 extends Computer{
    private String graphicCard;

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public T410(){
        this.setType("T410");
    }

    @Override
    public String toString() {
        return "{" + this.getType() +
                ":" + getGraphicCard() + ':' + getCpu() + ':' + getHardDisk() + ':' + getMonitor() + ':' + getOs() + ':' + getRam() +
                '}';
    }
}
