package structuralPattern.decoratorPattern;

public abstract class Decorator implements Component{
    Component component;

    void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
