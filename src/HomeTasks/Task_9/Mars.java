package HomeTasks.Task_9;

public class Mars extends Planet {
    String[] satellites = {"Phobos", "Deimos"};
    int radius = 3390;

    public int getNumberOfSatellite() {
        return satellites.length;
    }

    public boolean hasPopulation() {
        return false;
    }
}
