package structuralPattern.compositePattern;

import java.util.ArrayList;

public class ConcretePeople implements People {

    private final ArrayList<People> peopleArrayList = new ArrayList<>();
    private String name;
    private String position;
    private int salary;

    ConcretePeople(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void add(People people) {
        this.peopleArrayList.add(people);
    }

    public void remove(People people){
        this.peopleArrayList.remove(people);
    }

    public ArrayList<People> getChild(){
        return peopleArrayList;
    }

    @Override
    public String getInfo() {
        return "姓名:" + name + "\n" +
                "职位:" + position + "\n" +
                "工资:" + salary + "元\n";
    }
}
