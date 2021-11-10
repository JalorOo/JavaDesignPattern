package structuralPattern.decoratorPattern;

public class ConcreteDecoratorA extends Decorator {

    private final int addedState = 1;

    @Override
    public void operation() {
        super.operation();
        System.out.println("装饰器A行为："+addedState);
    }

}
