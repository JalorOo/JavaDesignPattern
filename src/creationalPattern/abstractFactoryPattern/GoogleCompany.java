package creationalPattern.abstractFactoryPattern;

public class GoogleCompany implements Company{
    @Override
    public Phone sellPhone() {
        return new AndroidPhone();
    }

    @Override
    public Tv sellTv() {
        return new AndroidTv();
    }
}
