package structuralPattern.bridgePattern;

public class Demo {
    public static void main(String[] args) {
        AbstractShape shape = new Circle(new Red());
        shape.draw();
    }
}
