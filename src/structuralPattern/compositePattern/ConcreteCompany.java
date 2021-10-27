package structuralPattern.compositePattern;

import java.util.ArrayList;

public class ConcreteCompany implements Company {

    private final ArrayList<Company> companyArrayList = new ArrayList<>();
    private String name;
    private String position;
    private int salary;

    ConcreteCompany(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void add(Company company) {
        this.companyArrayList.add(company);
    }

    public void remove(Company company){
        this.companyArrayList.remove(company);
    }

    public ArrayList<Company> getChild(){
        return companyArrayList;
    }

    @Override
    public String getInfo() {
        return "name:" + name + "\n" +
                "position:" + position + "\n" +
                "salary:" + salary + "\n";
    }
}
