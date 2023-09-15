package game;
import java.util.*;

public class Player {
    private String name;
    private String ipAddress;
    private int money;
    private ArrayList<String> cars;
    public Player(String name, String ipAddress, int money) {
        if(name == null) throw new IllegalArgumentException("The name must not be null.");
        if(ipAddress == null || ipAddress.length() == 0 || ipAddress.contains("\n") || ipAddress.contains(" ") || ipAddress.contains("\t")) throw new IllegalArgumentException("The ipAddress is not valid.");
        if(money < 0) throw new IllegalArgumentException("The money should be non-negative.");
        this.name = name;
        this.ipAddress = ipAddress;
        this.money = money;
        cars = new ArrayList<String>();
    }
    public int getMoney() { return money;}

}