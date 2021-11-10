package structuralPattern.proxyPattern;

/**
 * 代理主题角色
 * 包含对真实主题的引用
 * */
public class Proxy implements Subject{
    private final RealSubject realSubject = new RealSubject();

    private void preRequest(){
        System.out.println("预处理");
    }

    @Override
    public void request(){
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void postRequest(){
        System.out.println("处理完成");
    }
}
