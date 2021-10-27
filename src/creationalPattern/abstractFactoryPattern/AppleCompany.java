package creationalPattern.abstractFactoryPattern;

public class AppleCompany implements Company{
    @Override
    public Phone sellPhone() {
        return new iPhone();
    }

    @Override
    public Tv sellTv() {
        return new iTv();
    }
}
