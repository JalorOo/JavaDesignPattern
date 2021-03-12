package behavioralPattern.chainOfResponsibilityPattern;

public abstract class Player {
    private Player successor;

    public abstract void handle(int i);

    public Player setSuccessor(Player successor) {
        this.successor = successor;
        return this;
    }

    public void next(int i){
        if(successor != null){
            successor.handle(i);
        } else {
            System.out.println("游戏结束");
        }
    }
}
