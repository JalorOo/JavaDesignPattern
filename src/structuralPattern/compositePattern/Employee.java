package structuralPattern.compositePattern;

public class Employee implements Company{

    private String name;
    private String position;
    private int salary;

    Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return "name:" + name + "\n" +
                "position:" + position + "\n" +
                "salary:" + salary + "\n";
    }
}
