package tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import game.Player;
import game.vehicles.Car;
import game.utils.VehicleException;

public class Tests {
    @Test
    public void testPlayerConstructorWithNullName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Player(null, "127.0.0.1", 100);
        });
    }

    @Test
    public void testPlayerWithNegativeMoney() {
        assertThrows(IllegalArgumentException.class, () -> {new Player("Skulo", "fvuzdsak", -1);});
    }

    @Test
    public void testPlayerWithBadIpAddress() {
        assertThrows(IllegalArgumentException.class, () -> {Player skulo = new Player("Skulo", "fvuz dsak", 200);});
    }

    @Test
    public void testPlayersMoney() {
        Player jatekos = new Player("bela", "ads", 200);
        assertEquals(200, jatekos.getMoney());
    }

    @Test
    public void testAcceleration() {
        Car kocsi1 = new Car(200, 2000000);
        try {
        kocsi1.accelerate(40);
        } catch(VehicleException e){

        }
        assertEquals(40, kocsi1.getCurrentSpeed());
        try {
        kocsi1.accelerate(-20);
        } catch(VehicleException e) {
            
        }
        assertEquals(20, kocsi1.getCurrentSpeed());
    }

    @Test
    public void testAcceleration2() {
        Car kocsi1 = new Car(200, 2000000);
        try{
        kocsi1.accelerate(400);
        } catch(VehicleException e){

        }
        assertEquals(0, kocsi1.getCurrentSpeed());
    }

    @Test
    public void testAcceleration3() {
        assertThrows(VehicleException.class, () -> 
            {Car kocsi1 = new Car(200, 2000000);
             kocsi1.accelerate(-10);                     
                                             });
    }

}