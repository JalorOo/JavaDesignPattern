package behavioralPattern.chainOfResponsibilityPattern;

public class PlayerB extends Player{

    @Override
    public void handle(int i) {
        if(i == 2){
            System.out.println("B 执行");
        } else {
            System.out.println("B 让小弟干");
            next(i);
        }
    }
}
