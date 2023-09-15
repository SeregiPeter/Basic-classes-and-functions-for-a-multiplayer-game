package main;
import java.io.*;
import game.Player;
import game.vehicles.*;

public class Main {
    public static void main(String[] args) {
        Player daniel = loadPlayerFromFile("Daniel");
        Player peter = loadPlayerFromFile("Peter");
        Player Richard = loadPlayerFromFile("Richard");
        Player tamas = loadPlayerFromFile("Tamas");
        Player zorror = loadPlayerFromFile("Zorror");

        Car kocsi1 = new Car(200, 2000000);
        Car kocsi2 = new Car(170, 31000000);
        Car kocsi3 = new Car(150, 6000000);
        Car kocsi4 = new Car(200, 80000000);
        Car kocsi5 = new Car(400, 300012100);
    }

    public static Player loadPlayerFromFile(String playerName){
        File input = new File("users/" + playerName + ".txt");

        String[] data = null;
        try (BufferedReader bf = new BufferedReader(new FileReader(input))){
            String line = bf.readLine();
            data = line.split(" ");
            int money = 0;
            try {
                money = Integer.parseInt(data[1]);
            } catch(Exception e) {
                System.out.println("Data cannot convert into int.");
            }

            return new Player(playerName, data[0], money);
        } catch (IOException e) {
            System.out.println("IO error occured: " + e.getMessage());
        }

        return null;
    }
}