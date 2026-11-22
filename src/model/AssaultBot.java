package model;

public class AssaultBot extends Enemy{

    private double targetX;
    private double targetY;

    // Constructor
    public AssaultBot(double x, double y, double hp, double speed, double targetX, double targetY) {
        super(x, y, hp, speed);
        this.targetX = targetX;
        this.targetY = targetY;
    }

    // AssaultBot otw target
    @Override
    public void move(double deltaTime) {
        moveTowards(targetX, targetY, deltaTime);
    }
}