package structuralPattern.flyWeightPattern;

public class Demo {
    public static void main(String[] args) {
        ChessPiece p1 = ChessPieceFactory.getChessPiece("白");
        p1.put(1,1);
        ChessPiece p2 = ChessPieceFactory.getChessPiece("黑");
        p2.put(1,2);
        ChessPiece p3 = ChessPieceFactory.getChessPiece("白");
        p1.put(2,1);
        ChessPiece p4 = ChessPieceFactory.getChessPiece("黑");
        p2.put(4,2);
    }

}
