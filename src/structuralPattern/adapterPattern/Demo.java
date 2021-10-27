package structuralPattern.adapterPattern;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Data data = new Data();
        data.setName("毛毛没唧唧");
        Target target = new Adapter(data);
        target.show();
    }
}
