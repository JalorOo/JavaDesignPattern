package structuralPattern.compositePattern;

public class Employee implements People {

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
        return "姓名:" + name + "\n" +
                "职位:" + position + "\n" +
                "工资:" + salary + "元\n";
    }
}
