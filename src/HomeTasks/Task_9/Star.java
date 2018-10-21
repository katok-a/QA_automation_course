package HomeTasks.Task_9;

public class Star extends Star_System {
    private String name;
    private int planetsInSystem = 2;

    public int countPlanets() {
        return planetsInSystem;
    }

    ;

    public void addPlanet() {
        planetsInSystem++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlanetsInSystem() {
        return planetsInSystem;
    }

    public void setPlanetsInSystem(int planetsInSystem) {
        this.planetsInSystem = planetsInSystem;
    }

    @Override
    public void printGalaxyName() {
        System.out.println("Milky way");
    }

    @Override
    public int hashCode() {
        return 17 * planetsInSystem * name.hashCode();

    }
    @Override
    public String toString(){
        return this.name;
    }
}
