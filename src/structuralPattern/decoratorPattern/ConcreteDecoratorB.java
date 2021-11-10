package structuralPattern.decoratorPattern;

public class ConcreteDecoratorB extends Decorator{
    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    void addedBehavior() {
        System.out.println("装饰器B增加的行为");
    }
}
