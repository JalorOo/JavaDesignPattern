package structuralPattern.flyWeightPattern;

public class ChessPieceFactory {
    static final ChessPiece WHITE = new ChessPieceFlyWeight("白");
    static final ChessPiece BLACK = new ChessPieceFlyWeight("黑");

    public static ChessPiece getChessPiece(String color){
        if(color.equals("白")){
            return WHITE;
        }
        return BLACK;
    }
}
