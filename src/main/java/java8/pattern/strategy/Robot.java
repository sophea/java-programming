package java8.pattern.strategy;

public class Robot {
    private String name;
    private RobotBehavior behavior;
 
    public Robot() {
        
    }
    
    public Robot(String name) {
        this.name = name;
    }
    public void setBehavior(RobotBehavior behavior) {
        this.behavior = behavior;
    }
    public RobotBehavior getBehavior() {
        return behavior;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void showBehavior() {
        behavior.showBehavior();
    }
}
