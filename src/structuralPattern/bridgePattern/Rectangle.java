package structuralPattern.bridgePattern;

public class Rectangle extends AbstractShape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println(
                "使用[" + color.getColor() + "]画矩形"
        );
    }
}
