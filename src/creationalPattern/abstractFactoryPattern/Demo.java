package creationalPattern.abstractFactoryPattern;

public class Demo {
    public static void main(String[] args) {
        Company google = new GoogleCompany();
        Phone phone;
        phone = google.sellPhone();
        phone.read();
        Tv tv;
        tv = google.sellTv();
        tv.watch();
    }
}
