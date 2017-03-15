package java8.pattern.strategy;

public class AgressiveBehavior implements RobotBehavior {

    @Override
    public void showBehavior() {
        System.out.println("My Behavior is agressive");

    }

}
