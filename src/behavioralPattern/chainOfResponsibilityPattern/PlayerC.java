package behavioralPattern.chainOfResponsibilityPattern;

public class PlayerC extends Player{

    @Override
    public void handle(int i) {
        if(i == 3){
            System.out.println("C 执行");
        } else {
            System.out.println("C 让小弟干");
            next(i);
        }
    }
}
