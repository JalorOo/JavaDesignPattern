package structuralPattern.compositePattern;

/**
 * 组合模式
 * 一层一层叠加起来
 */
public class Demo {
    public static void main(String[] args) {
        ConcretePeople company = new ConcretePeople("陈某","CEO",1);
        ConcretePeople developDep = new ConcretePeople("毛某","研发部经理",120000);
        ConcretePeople salesDep = new ConcretePeople("唐某","销售部经理",150000);
        ConcretePeople financeDep = new ConcretePeople("叶某","财务部经理",100000);
        Employee e1 = new Employee("A某","研发部员工",3000);
        Employee e2 = new Employee("B某","研发部员工",2500);
        Employee e3 = new Employee("C某","研发部员工",4000);
        Employee e4 = new Employee("D某","研发部员工",6000);
        Employee e5 = new Employee("E某","销售部员工",3500);
        Employee e6 = new Employee("F某","销售部员工",2300);
        Employee e7 = new Employee("G某","销售部员工",5000);
        Employee e8 = new Employee("H某","财务部员工",3800);
        Employee e9 = new Employee("I某","财务部员工",4300);
        company.add(developDep);
        company.add(salesDep);
        company.add(financeDep);
        developDep.add(e1);
        developDep.add(e2);
        developDep.add(e3);
        developDep.add(e4);
        salesDep.add(e5);
        salesDep.add(e6);
        salesDep.add(e7);
        financeDep.add(e8);
        financeDep.add(e9);
        System.out.println(company.getInfo());
        display(company);
    }

    static void display(ConcretePeople company){
        for(People c:company.getChild()){
            if(c instanceof Employee){
                System.out.println(c.getInfo());
            } else {
                System.out.println("\n"+c.getInfo());
                display((ConcretePeople) c);
            }
        }
    }
}
