public class Mobil {
    private String model;
    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/hour");
    }
}
