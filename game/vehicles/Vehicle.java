package game.vehicles;
import game.utils.VehicleException;

public abstract class Vehicle {
    protected final int id;
    private static int currentId = 0;
    protected double currentSpeed;
    public Vehicle() {
        id = currentId;
        currentId++;
        currentSpeed = 0.0;
    }
    public double getCurrentSpeed() {
        return this.currentSpeed;
    }
    public int getId(){ return id; }
    protected void accelerateCurrentSpeed(double change) throws VehicleException {
        if(currentSpeed + change < 0) throw new VehicleException("The speed cannot be negative.");
        currentSpeed += change;
    }
    public abstract void accelerate(double amount) throws VehicleException;
}