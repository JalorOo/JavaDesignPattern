package structuralPattern.flyWeightPattern;

public class ChessPieceFlyWeight implements ChessPiece{

    private final String color;

    ChessPieceFlyWeight(String color){
        this.color = color;
    }

    @Override
    public void put(int x, int y) {
        System.out.println(color+"子放在（"+x+","+y+"）");
    }
}
