package java8.pattern.strategy;

public class DefensiveBehavior implements RobotBehavior {

    @Override
    public void showBehavior() {
        System.out.println("My Behavior is defensive");

    }

}
