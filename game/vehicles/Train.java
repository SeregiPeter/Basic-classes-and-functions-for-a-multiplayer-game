package game.vehicles;
import game.utils.VehicleException;

public class Train extends Vehicle {




    @Override
    public void accelerate(double amount) {
        if(amount < 0) amount = amount / 10.0;
        try {
            accelerateCurrentSpeed(amount);
        } catch(VehicleException e) {
            System.out.println("Train acceleration error.");
        }
    }

}