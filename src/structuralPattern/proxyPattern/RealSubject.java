package structuralPattern.proxyPattern;

public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("真实处理");
    }
}
