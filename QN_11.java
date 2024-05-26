/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsheet_1;

/**
 *
 * @author rajis
 */


   class Player {
    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class FootballPlayer extends Player {
    private String position;

    public FootballPlayer(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Position: " + position);
    }
}

class CricketPlayer extends Player {
    private String role;

    public CricketPlayer(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: " + role);
    }
}

class VolleyballPlayer extends Player {
    private String position;

    public VolleyballPlayer(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Position: " + position);
    }
}

public class QN_11 {
    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer("John Doe", 25, "Forward");
        CricketPlayer cricketPlayer = new CricketPlayer("Jane Smith", 28, "Batsman");
        VolleyballPlayer volleyballPlayer = new VolleyballPlayer("Alice Johnson", 22, "Setter");

        System.out.println("Football Player Details:");
        footballPlayer.displayDetails();

        System.out.println("\nCricket Player Details:");
        cricketPlayer.displayDetails();

        System.out.println("\nVolleyball Player Details:");
        volleyballPlayer.displayDetails();
    }
}
