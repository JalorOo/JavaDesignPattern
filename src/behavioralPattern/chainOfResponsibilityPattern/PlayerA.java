package behavioralPattern.chainOfResponsibilityPattern;

public class PlayerA extends Player{

    @Override
    public void handle(int i) {
        if(i == 1){
            System.out.println("A 执行");
        } else {
            System.out.println("A 让小弟干");
            next(i);
        }
    }
}
