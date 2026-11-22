package model;

// Kode disusun dengan bantuan ChatGPT sebagai pendamping pembelajaran.
public abstract class GameObject {

    // Posisi objek di dalam arena
    private double x;
    private double y;

    // Constructor
    public GameObject(double x, double y){
        this.x = x;
        this.y = y;
    }

    // Method abstrak yang wajib diimplementasikan subclass
    public abstract void update(double deltaTime);

    // Posisi x
    public double getX() {
        return x;
    }

    // Posisi y
    public double getY() {
        return y;
    }

    // Ubah posisi opbjek
    public void setPosition(double x, double y){
        this.x = x;
        this.y = y;
    }
}