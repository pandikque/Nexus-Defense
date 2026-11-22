package model;

import interfaces.Damageable;

public abstract class Enemy extends GameObject implements Damageable {

    // Atribut musuh
    private double hp;
    private double speed;

    // Constructor
    public Enemy(double x, double y, double hp, double speed){
        super(x, y);
        this.hp = hp;
        this.speed = speed;
    }

    // Mengatur pergerakan musuh
    public abstract void move(double deltaTime);

    // Memperbarui kondusi musuh
    @Override
    public void update(double deltaTime) {
        move(deltaTime);
    }

    // Implementasi methode dari interface Damageable
    @Override
    public void takeDamage(double damage){
        if (damage > 0) {
            hp -= damage;

            if (hp <0){
                hp = 0;
            }
        }
    }

    // Ngambil hp musuh
    public double getHp(){
        return hp;
    }

    //Ngambil speed musuh
    public double getSpeed(){
        return speed;
    }

    // Periksa musuh sudah mati
    public boolean isDead(){
        return hp <=0;
    }

    // Pergerakan musuh
    protected void moveTowards(double targetX, double targetY, double deltaTime){
        double dx = targetX - getX();
        double dy = targetY - getY();

        double distance = Math.hypot(dx, dy);

        if (distance > 0){
            double moveDistance = Math.min(getSpeed() * deltaTime, distance);

            double moveX = (dx / distance) * moveDistance;
            double moveY = (dy / distance) * moveDistance;

            setPosition(getX() + moveX, getY() + moveY);
        }
    }
}