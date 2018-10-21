package HomeTasks.Task_9;

public class Planet extends Star_System {
    String name;
    int numberOfMoons;
    boolean hasPopulation;

    public void inhabit() {
        hasPopulation = true;
    }

    public Planet() {
    }

    ;

    public Planet(String name) {
        this.name = name;
    }

    public Planet(String name, boolean population) {
        this(name);
        this.hasPopulation = population;
    }
    public void printGalaxyName(){
        System.out.println("Galaxy far away.");
    }
}
