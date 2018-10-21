package HomeTasks.Task_9;

public class Sun extends Star {
    String spectralClass;
    boolean hasInhabitPlanets = true;

    void changeSpectralClass(String newClass){
        this.spectralClass = newClass;
    }
    private void voidPopulation(){
        hasInhabitPlanets = false;
    }


}
