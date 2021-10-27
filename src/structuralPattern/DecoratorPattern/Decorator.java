package structuralPattern.DecoratorPattern;

public abstract class Decorator {
    Component component ;
    void setComponent(Component component){
        this.component = component;
    }

    void operation(){
        component.operation();
    }
}
