package structuralPattern.decoratorPattern;

public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("具体的行为");
    }
}
