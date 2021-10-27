package creationalPattern.abstractFactoryPattern;

public class AndroidPhone implements Phone {

    @Override
    public void read() {
        System.out.println("看 Android 手机");
    }
}
