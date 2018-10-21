package HomeTasks.Task_9;

public class Earth extends Planet {
    boolean hasPopulation=true;
    int astroUnit = 150000000;

    public void sendSignal(){
        System.out.println("Hello from the children of Planet Earth");
    }
    public int getDistancetToSun(){
        return astroUnit;
    }
}

