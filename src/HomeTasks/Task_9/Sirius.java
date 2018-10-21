package HomeTasks.Task_9;

public class Sirius extends  Star{
    float distanceFromSunLightYears = 8.6f;
    private final long KMINLIGHTYEAR = 9460528400000L;

    public float getDistanceInLightYears(){
        return distanceFromSunLightYears;
    }
    public double getDistanceInKm(){
        return distanceFromSunLightYears*KMINLIGHTYEAR;
    }


}
