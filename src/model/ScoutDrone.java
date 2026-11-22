package model;

public class ScoutDrone extends Enemy{

    private double targetX;
    private double targetY;

    // Constructor
    public ScoutDrone(double x, double y, double hp, double speed, double targetX, double targetY) {
        super(x, y, hp, speed);
        this.targetX = targetX;
        this.targetY = targetY;
    }

    // ScoutDrone otw target
    @Override
    public void move(double deltaTime) {
        moveTowards(targetX, targetY, deltaTime);
    }
}