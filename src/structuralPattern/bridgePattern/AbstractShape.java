package structuralPattern.bridgePattern;

public abstract class AbstractShape {
    Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
