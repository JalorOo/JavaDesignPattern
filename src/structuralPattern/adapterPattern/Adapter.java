package structuralPattern.adapterPattern;

public class Adapter implements Target{
    Data data;

    public Adapter(Data data) {
        this.data = data;
    }


    @Override
    public void show() {
        System.out.println("名字为："+data.getName());
    }
}
