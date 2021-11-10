package structuralPattern.proxyPattern;

public class Demo {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.request();
    }
}
