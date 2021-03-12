package creationalPattern.builderPattern;

public class Demo {
    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector();
        Computer t410 = computerDirector.constructT410();
        System.out.println(t410);
    }
}
