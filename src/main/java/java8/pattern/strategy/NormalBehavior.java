package java8.pattern.strategy;

public class NormalBehavior implements RobotBehavior {

    @Override
    public void showBehavior() {
        System.out.println("My Behavior is Normal");

    }

}
