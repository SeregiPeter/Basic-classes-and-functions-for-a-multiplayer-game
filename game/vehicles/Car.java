package game.vehicles;
import game.utils.VehicleException;

public class Car extends Vehicle {
    private final int maxSpeed;
    private final int price;
    public Car(int maxSpeed, int price) {
        super();
        this.maxSpeed = maxSpeed;
        this.price = price;
    }


    public int getPrice() { return price; }
    @Override
    public void accelerate(double amount) throws VehicleException {
        if((currentSpeed + amount) <= maxSpeed){
            try {
                accelerateCurrentSpeed(amount);
            } catch (VehicleException e) {
                throw e;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(id);
        builder.append("\t");
        builder.append(maxSpeed);
        builder.append("\t");
        builder.append(price);
        return builder.toString(); 
    }

}