package behavioralPattern.chainOfResponsibilityPattern;

/**
 * 责任链模式
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new PlayerA().setSuccessor(
                new PlayerB().setSuccessor(
                        new PlayerC().setSuccessor(
                                null
                        )
                )
        );
        player.handle(10);
    }
}
